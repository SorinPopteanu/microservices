package com.eazybank.accounts.service.impl;

import com.eazybank.accounts.dto.AccountsDto;
import com.eazybank.accounts.dto.CardsDto;
import com.eazybank.accounts.dto.CustomerDetailsDto;
import com.eazybank.accounts.dto.LoansDto;
import com.eazybank.accounts.entity.Accounts;
import com.eazybank.accounts.entity.Customer;
import com.eazybank.accounts.exception.ResourceNotFoundException;
import com.eazybank.accounts.mapper.AccountsMapper;
import com.eazybank.accounts.mapper.CustomerMapper;
import com.eazybank.accounts.repository.AccountsRepository;
import com.eazybank.accounts.repository.CustomerRepository;
import com.eazybank.accounts.service.ICustomerService;
import com.eazybank.accounts.service.client.CardsFeignClient;
import com.eazybank.accounts.service.client.LoansFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    /**
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a giver mobileNumber
     */
    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        Customer customer = customerRepository.findByMobileNumber(mobileNumber)
                                              .orElseThrow(() -> new ResourceNotFoundException("Customer",
                                                                                               "mobileNumber",
                                                                                               mobileNumber
                                              ));
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId())
                                              .orElseThrow(() -> new ResourceNotFoundException("Account",
                                                                                               "customerId",
                                                                                               customer.getCustomerId()
                                                                                                       .toString()
                                              ));
        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer,
                                                                                       new CustomerDetailsDto()
                                                                                      );
        customerDetailsDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));

        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(mobileNumber);
        customerDetailsDto.setLoansDto(loansDtoResponseEntity.getBody());

        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(mobileNumber);
        customerDetailsDto.setCardsDto(cardsDtoResponseEntity.getBody());

        return customerDetailsDto;
    }
}