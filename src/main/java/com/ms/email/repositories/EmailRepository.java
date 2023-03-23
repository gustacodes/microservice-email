package com.ms.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.email.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>  {
    
}
