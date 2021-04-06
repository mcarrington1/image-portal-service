package com.image.portal.service;

import com.image.portal.model.Share;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private JavaMailSender javaMailSender;

    @Autowired
    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    /**
     * Send email via the mail sender library. This generates the body and contents of the email.
     * @param share
     * @throws MailException Most common cause for a mail exception is the server not being up.
     */
    public void sendEmail(Share share) throws MailException {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(share.getEmail());
        mail.setSubject("Image Portal - Image Share");
        mail.setText("This is from the Image Portal site. Check out these shared images: " + share.getImageUrls());

        javaMailSender.send(mail);
    }
}
