package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.ContactMessage;
import com.example.matoshritoursandtravels.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/submitContact")
    public RedirectView submitContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        ContactMessage contact = new ContactMessage();
        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);
        contactRepository.save(contact);

        return new RedirectView("/contactus.html?success=true");
    }
}
