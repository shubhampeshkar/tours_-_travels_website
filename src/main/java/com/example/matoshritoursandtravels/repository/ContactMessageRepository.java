package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
