package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.service.AdminService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController  // ✅ Fix: Use @RestController to return responses properly
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session) {
        if (adminService.authenticate(username, password)) {
            session.setAttribute("admin", username);
            return "success";  // ✅ Fix: Return "success" for front-end to handle
        }
        return "failure";  // ✅ Fix: Return "failure" for front-end error handling
    }

    @GetMapping("/admindashboard")
    public String showDashboard(HttpSession session) {
        if (session.getAttribute("admin") == null) {
            return "redirect:/adminlogin.html";  // ✅ Ensure only logged-in admins can access dashboard
        }
        return "redirect:/admindashboard.html";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/adminlogin.html";
    }
}
