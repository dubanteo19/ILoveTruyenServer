package com.nonglam.ILoveTruyen.emailService;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.nonglam.ILoveTruyen.EmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImp implements EmailService {
    private final JavaMailSender javaMailSender;
    @Value("$(spring.mail.username)") private String sender;
    public EmailServiceImp(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public String sendSimpleEmail(EmailDetail emailDetail) {
        try{
            var simpleEmailMessage = new SimpleMailMessage();
            simpleEmailMessage.setTo(emailDetail.recipient());
            simpleEmailMessage.setFrom(sender);
            simpleEmailMessage.setSubject(emailDetail.subject());
            simpleEmailMessage.setText(emailDetail.body());
            javaMailSender.send(simpleEmailMessage);
            return "email sent successfully";
        }
        catch (Exception e){
            return "Error while sending email";
        }
    }
}
