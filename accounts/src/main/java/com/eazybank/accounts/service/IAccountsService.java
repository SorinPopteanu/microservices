package com.eazybank.accounts.service;

import com.eazybank.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDTO - CustomerDto Object
     */
    void createAccount(CustomerDto customerDTO);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return - Accounts Details based on given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDTO - CustomerDto Object
     * @return - Boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDTO);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return - Boolean indicating if the deletion of Account is successful or not
     */
    boolean deleteAccount(String mobileNumber);

}
