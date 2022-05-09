package com.example.tutoronline.controllers;

import com.example.tutoronline.entities.AccountEntity;
import com.example.tutoronline.entities.ResponseObject;
import com.example.tutoronline.repositories.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    AuthRepository loginRespository;

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ResponseObject> login(@RequestBody AccountEntity account){
        AccountEntity acc = loginRespository.findByEmail(account.getEmail());
        // account is exist
        if(acc != null){
            // validate password
            if(acc.getPassword().equals(account.getPassword())) {
                if(acc.getType() == account.getType()){
                    return ResponseEntity.status(HttpStatus.OK).body(
                            new ResponseObject("OK","login successful!",acc)
                    );
                }
                else{
                    return ResponseEntity.status(HttpStatus.OK).body(
                            new ResponseObject("CHANGE","please change account type!",null)
                    );
                }
            }
            else{
                return ResponseEntity.status(HttpStatus.OK).body(
                        new ResponseObject("WRONG","wrong password!",null)
                );
            }
        }
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("NO","account is not found!",null)
        );
    }
}
