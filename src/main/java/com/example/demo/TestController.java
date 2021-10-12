package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RestController
@RequestMapping("hello-world")
public class TestController
{

    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping("/")
    public ResponseEntity getData() throws MessagingException {
        /*MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg,true);
        helper.setTo("qasim@mailinator.com");
        helper.setSubject("lksajkldjlkfjlk alskdjl fjlksaj fljas ldf");

        helper.setText("sa;lkjdklf;j aslkjlkdj  lfdajljdfsl jslkdsfalf jlfdjasdlfasd",false);

        javaMailSender.send(msg);*/

        return ResponseEntity.ok("Return value present.");
    }
}
