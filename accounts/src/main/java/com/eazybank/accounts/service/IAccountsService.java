package com.eazybank.accounts.service;

import com.eazybank.accounts.dto.CustomerDTO;

public interface IAccountsService {

    /**
     *
     * @param customerDTO - CustomerDTO Object
     */
    void createAccount(CustomerDTO customerDTO);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return - Accounts Details based on given mobileNumber
     */
    CustomerDTO fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDTO - CustomerDTO Object
     * @return - Boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDTO customerDTO);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return - Boolean indicating if the deletion of Account is successful or not
     */
    boolean deleteAccount(String mobileNumber);

}
