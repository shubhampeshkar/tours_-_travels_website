package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactMessage, Long> {
}
