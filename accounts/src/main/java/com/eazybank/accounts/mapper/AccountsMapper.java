package com.eazybank.accounts.mapper;

import com.eazybank.accounts.entity.Accounts;
import com.eazybank.accounts.dto.AccountsDto;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDTO(Accounts accounts, AccountsDto accountsDTO) {
        accountsDTO.setAccountNumber(accounts.getAccountNumber());
        accountsDTO.setAccountType(accounts.getAccountType());
        accountsDTO.setBranchAddress(accounts.getBranchAddress());
        return accountsDTO;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDTO, Accounts accounts) {
        accounts.setAccountNumber(accountsDTO.getAccountNumber());
        accounts.setAccountType(accountsDTO.getAccountType());
        accounts.setBranchAddress(accountsDTO.getBranchAddress());
        return accounts;
    }
}
