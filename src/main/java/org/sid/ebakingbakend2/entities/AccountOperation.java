package org.sid.ebakingbakend2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebakingbakend2.enums.OperationType;

import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor


public class AccountOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;
    private Date operationDate;
    private double amount;

    @Enumerated(EnumType.STRING)
    private OperationType type;


    @ManyToOne
    private BankAccount bankAccount;
    private String description;
}
