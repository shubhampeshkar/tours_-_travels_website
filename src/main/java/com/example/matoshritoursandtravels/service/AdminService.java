package com.example.matoshritoursandtravels.service;

import com.example.matoshritoursandtravels.model.Admin;
import com.example.matoshritoursandtravels.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Ensure the default admin account exists in the database
    @PostConstruct
    public void initAdminUser() {
        Optional<Admin> existingAdmin = adminRepository.findByUsername("admin");
        if (existingAdmin.isEmpty()) {
            Admin admin = new Admin();
            admin.setUsername("admin");
            admin.setPassword("admin");  // Ensure password is set correctly
            adminRepository.save(admin);
            System.out.println("✅ Default admin user created: admin / admin");
        }
    }

    // Authenticate admin user
    public boolean authenticate(String username, String password) {
        Optional<Admin> admin = adminRepository.findByUsername(username);
        if (admin.isPresent()) {
            String storedPassword = admin.get().getPassword();
            System.out.println("Stored Password: " + storedPassword);
            if (storedPassword.equals(password)) {
                System.out.println("✅ Login successful for: " + username);
                return true;
            } else {
                System.out.println("❌ Incorrect password for: " + username);
            }
        } else {
            System.out.println("❌ No admin found with username: " + username);
        }
        return false;
    }
}
