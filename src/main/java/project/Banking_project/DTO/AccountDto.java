package project.Banking_project.DTO;
/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private  Long id;
    private String accountHolderName;
    private Double balance;
}
 */

// creating a record class for AccountDto it helps to retify boilerplate code.

public record AccountDto(Long id,
                         String accountHolderName,
                         Double balance) {
}