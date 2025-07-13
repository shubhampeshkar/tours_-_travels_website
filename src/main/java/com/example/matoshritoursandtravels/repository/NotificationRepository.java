package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByEmail(String email);
}
