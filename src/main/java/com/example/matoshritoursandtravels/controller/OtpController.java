package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/otp")
public class OtpController {

    @Autowired
    private OtpService otpService;

    @PostMapping("/send")
    public String sendOtp(@RequestParam String mobile) {
        return otpService.sendOtp(mobile);
    }

    @PostMapping("/verify")
    public String verifyOtp(@RequestParam String mobile, @RequestParam String code) {
        return otpService.verifyOtp(mobile, code);
    }
}
