package com.eazybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDTO {

    @Schema(
            description = "Account number of EazyBank Account",
            example = "1234567890"
    )
    @NotEmpty(message = "Name can not be null/empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of EazyBank Account",
            example = "Savings"
    )
    @NotEmpty(message = "Name can not be null/empty")
    private String accountType;

    @Schema(
            description = "EazyBank branch address",
            example = "123, Main Street, New York, USA"
    )
    @NotEmpty(message = "Name can not be null/empty")
    private String branchAddress;
}
