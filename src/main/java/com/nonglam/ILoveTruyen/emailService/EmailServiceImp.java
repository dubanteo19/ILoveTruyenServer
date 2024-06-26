package com.nonglam.ILoveTruyen.emailService;
import com.nonglam.ILoveTruyen.EmailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.concurrent.ExecutorService;

@Service
public class EmailServiceImp implements EmailService {
    private final JavaMailSender javaMailSender;
    private final ExecutorService executorService;
    public EmailServiceImp(JavaMailSender javaMailSender, ExecutorService executorService) {
        this.javaMailSender = javaMailSender;
        this.executorService = executorService;
    }

    @Override
    public String sendSimpleEmail(EmailDetail emailDetail) {
        try{
                executorService.submit(()->{
                    var simpleEmailMessage = new SimpleMailMessage();
                    simpleEmailMessage.setTo(emailDetail.recipient());
                    String sender = "21130444@st.hcmuaf.edu.vn";
                    String formatedSender=MessageFormat.format("I Love Truyen <{0}>", sender);
                    simpleEmailMessage.setFrom(formatedSender);
                    simpleEmailMessage.setSubject(emailDetail.subject());
                    simpleEmailMessage.setText(emailDetail.body());
                    javaMailSender.send(simpleEmailMessage);
                });
            return "email sent successfully";
        }
        catch (Exception e)
        {
            return "Error while sending email"+e.getMessage();
        }
    }
}
