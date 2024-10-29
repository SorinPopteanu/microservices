package com.eazybank.cards.mapper;

import com.eazybank.cards.dto.CardsDto;
import com.eazybank.cards.entity.Cards;

public class CardsMapper {

    public static CardsDto mapToCardsDTO(Cards cards, CardsDto cardsDTO) {
        cardsDTO.setCardNumber(cards.getCardNumber());
        cardsDTO.setCardType(cards.getCardType());
        cardsDTO.setMobileNumber(cards.getMobileNumber());
        cardsDTO.setTotalLimit(cards.getTotalLimit());
        cardsDTO.setAvailableAmount(cards.getAvailableAmount());
        cardsDTO.setAmountUsed(cards.getAmountUsed());
        return cardsDTO;
    }

    public static Cards mapToCards(CardsDto cardsDTO, Cards cards) {
        cards.setCardNumber(cardsDTO.getCardNumber());
        cards.setCardType(cardsDTO.getCardType());
        cards.setMobileNumber(cardsDTO.getMobileNumber());
        cards.setTotalLimit(cardsDTO.getTotalLimit());
        cards.setAvailableAmount(cardsDTO.getAvailableAmount());
        cards.setAmountUsed(cardsDTO.getAmountUsed());
        return cards;
    }

}