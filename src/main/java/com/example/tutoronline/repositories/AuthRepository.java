package com.example.tutoronline.repositories;

import com.example.tutoronline.entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<AccountEntity,Long> {
    AccountEntity findByEmail(String email);


}
