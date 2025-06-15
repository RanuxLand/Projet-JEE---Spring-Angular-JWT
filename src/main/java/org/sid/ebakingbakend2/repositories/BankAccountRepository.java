package org.sid.ebakingbakend2.repositories;

import org.sid.ebakingbakend2.entities.BankAccount;
import org.sid.ebakingbakend2.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
