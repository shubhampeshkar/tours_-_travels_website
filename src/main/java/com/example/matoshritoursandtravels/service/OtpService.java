package com.example.matoshritoursandtravels.service;

import com.twilio.rest.verify.v2.service.Verification;
import com.twilio.rest.verify.v2.service.VerificationCheck;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OtpService {

    @Value("${twilio.service.sid}")
    private String serviceSid;

    public String sendOtp(String mobileNumber) {
        Verification verification = Verification.creator(
                        serviceSid,
                        "+91" + mobileNumber,
                        "sms")
                .create();

        return verification.getStatus();
    }

    public String verifyOtp(String mobileNumber, String code) {
        VerificationCheck check = VerificationCheck.creator(serviceSid)
                .setTo("+91" + mobileNumber)
                .setCode(code)
                .create();

        return check.getStatus();
    }
}
