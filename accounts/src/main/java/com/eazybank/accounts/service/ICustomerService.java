package com.eazybank.accounts.service;

import com.eazybank.accounts.dto.CustomerDetailsDto;

public interface ICustomerService {

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a giver mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
