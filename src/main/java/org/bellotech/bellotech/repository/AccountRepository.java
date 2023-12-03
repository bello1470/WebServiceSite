package org.bellotech.bellotech.repository;

import java.util.Optional;

import org.bellotech.bellotech.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository <Account, Long> {

        @Query(value = "select * from ourusers where email = ?1 ", nativeQuery = true )
    Optional<Account> findByEmail(String email);

    
}
