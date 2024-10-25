package com.eazybank.loans.service;

import com.eazybank.loans.dto.LoansDTO;

public interface ILoansService {

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createLoan(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile Number
     *  @return Loan Details based on a given mobileNumber
     */
    LoansDTO fetchLoan(String mobileNumber);

    /**
     *
     * @param loansDTO - LoansDTO Object
     * @return boolean indicating if the update of card details is successful or not
     */
    boolean updateLoan(LoansDTO loansDTO);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of loan details is successful or not
     */
    boolean deleteLoan(String mobileNumber);

}
