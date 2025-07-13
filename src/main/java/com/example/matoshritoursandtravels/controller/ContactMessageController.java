package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.ContactMessage;
import com.example.matoshritoursandtravels.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactMessageController {

    @Autowired
    private ContactMessageRepository contactMessageRepository;

    @GetMapping("/contactmessages")
    public List<ContactMessage> getAllMessages() {
        return contactMessageRepository.findAll();
    }
}
