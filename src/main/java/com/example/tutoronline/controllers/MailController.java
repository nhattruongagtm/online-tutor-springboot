package com.example.tutoronline.controllers;

import com.example.tutoronline.entities.AccountEntity;
import com.example.tutoronline.services.EmailService;
import com.example.tutoronline.services.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.net.IDN;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class MailController {

    EmailService mailService = new EmailServiceImpl();

    @RequestMapping ("/send-mail")
    @CrossOrigin(origins = "http://localhost:3000")
    public String sendMail(@RequestBody AccountEntity accountEntity){
        String code = randomCode();
        mailService.sendSimpleMessage(accountEntity.getEmail(),"Xác nhận mã đăng ký tài khoản Gia Sư Trực Tuyến","Mã đăng ký của bạn là: " + code);
        return code;
    }
    private String randomCode(){
        String code = "";
        String[] characters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","0","2","3","4","5","6","7","8","9"};
        for(int i = 0; i < 6; i++){
            int random = new Random().nextInt(characters.length);
            code+=characters[random].toUpperCase();
        }
        return code;
    }


}
