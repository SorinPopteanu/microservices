package com.eazybank.cards.service;

import com.eazybank.cards.dto.CardsDTO;

public interface ICardsService {

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createCard(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile Number
     *  @return Card Details based on a given mobileNumber
     */
    CardsDTO fetchCard(String mobileNumber);

    /**
     *
     * @param cardsDTO - CardsDTO Object
     * @return boolean indicating if the update of card details is successful or not
     */
    boolean updateCard(CardsDTO cardsDTO);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of card details is successful or not
     */
    boolean deleteCard(String mobileNumber);

}