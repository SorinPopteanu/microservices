package com.eazybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name = "CustomerDetails", description = "Schema to hold Customer, Account, Cards and Loans information")
public class CustomerDetailsDto {

    @Schema(description = "Name of the Customer", example = "Sorin Popteanu")
    @NotEmpty(message = "Name can not be null/empty")
    @Size(min = 3, max = 30, message = "The length of the name should be between 3 and 30")
    private String name;

    @Schema(description = "Email of the Customer", example = "sorinpopteanu123@gmail.com")
    @NotEmpty(message = "Email can not be null/empty")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(description = "Mobile Number of the Customer", example = "0731418522")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the Customer")
    private AccountsDto accountsDto;

    @Schema(description = "Loans details of the Customer")
    private LoansDto loansDto;

    @Schema(description = "Cards details of the Customer")
    private CardsDto cardsDto;

}
