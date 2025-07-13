package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.*;
import com.example.matoshritoursandtravels.repository.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register.html"; // Serve static HTML
    }

    @PostMapping("/register")
    @ResponseBody
    public String registerUser(@ModelAttribute User user) {
        userRepository.save(user);
        return "Registration successful!";
    }

    @GetMapping("/clogin")
    public String showLoginPage() {
        return "clogin.html"; // Serve static login page
    }

    @PostMapping("/clogin")
    @ResponseBody
    public String userLogin(@RequestParam String email, @RequestParam String password, HttpSession session) {
        Optional<User> user = userRepository.findByEmail(email);

        if (user.isPresent() && user.get().getPassword().equals(password)) {
            session.setAttribute("userEmail", email); // Store session
            return "success";
        } else {
            return "Invalid credentials";
        }
    }

    @GetMapping("/cdashboard")
    public String showDashboard(HttpSession session) {
        if (session.getAttribute("userEmail") == null) {
            return "redirect:/clogin"; // Redirect to login if not logged in
        }
        return "redirect:/cdashboard.html"; // Redirect to static HTML page
    }


    @GetMapping("/clogout")
    @ResponseBody
    public String logout(HttpSession session) {
        session.invalidate(); // Destroy session
        return "Logged out successfully!";
    }

    @GetMapping("/myinfo")
    @ResponseBody
    public User getMyInfo(HttpSession session) {
        String email = (String) session.getAttribute("userEmail");
        if (email == null) return null;
        return userRepository.findByEmail(email).orElse(null);
    }


    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/mybookedpackage")
    public String showMyBookedPackages(HttpSession session) {
        if (session.getAttribute("userEmail") == null) return "redirect:/clogin";
        return "mybookedpackage.html";
    }

    @GetMapping("/api/mybookedpackage")
    @ResponseBody
    public List<Booking> getMyBookedPackages(HttpSession session) {
        String email = (String) session.getAttribute("userEmail");
        return bookingRepository.findByEmail(email);
    }


    @Autowired
    private BookingTreksAndToursRepository trekRepo;

    @GetMapping("/mybookedtrekandtours")
    public String showMyBookedTreks(HttpSession session) {
        if (session.getAttribute("userEmail") == null) return "redirect:/clogin";
        return "mybookedtrekandtours.html";
    }

    @GetMapping("/api/mybookedtreks")
    @ResponseBody
    public List<BookingTreksAndTours> getMyBookedTreks(HttpSession session) {
        String email = (String) session.getAttribute("userEmail");
        return trekRepo.findByEmail(email);
    }



    @Autowired
    private RentalCarBookingRepository rentalRepo;

    @GetMapping("/mybookedrentalservices")
    public String showMyBookedRentals(HttpSession session) {
        if (session.getAttribute("userEmail") == null) return "redirect:/clogin";
        return "mybookedrentalservices.html";
    }

    @GetMapping("/api/mybookedrentals")
    @ResponseBody
    public List<RentalCarBooking> getMyBookedRentals(HttpSession session) {
        String email = (String) session.getAttribute("userEmail");
        return rentalRepo.findByCustomerEmail(email);
    }


    @Autowired
    private NotificationRepository notificationRepository;

    @GetMapping("/notification")
    public String showNotificationPage(HttpSession session) {
        if (session.getAttribute("userEmail") == null) return "redirect:/clogin";
        return "notification.html";
    }

    @GetMapping("/api/notifications")
    @ResponseBody
    public List<Notification> getNotifications(HttpSession session) {
        String email = (String) session.getAttribute("userEmail");
        return notificationRepository.findByEmail(email);
    }



}





