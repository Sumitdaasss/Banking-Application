package project.Banking_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.Banking_project.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
