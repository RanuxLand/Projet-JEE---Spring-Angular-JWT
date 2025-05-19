package org.sid.ebakingbakend2.dtos;
import lombok.Data;

@Data
public class DebitDTO {
    private String accountId;
    private double amount;
    private String description;
}