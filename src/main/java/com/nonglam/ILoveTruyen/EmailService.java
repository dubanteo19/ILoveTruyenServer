package com.nonglam.ILoveTruyen;

import com.nonglam.ILoveTruyen.emailService.EmailDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public interface EmailService {
    String sendSimpleEmail(EmailDetail emailDetail);
}
