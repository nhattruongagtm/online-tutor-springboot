package com.example.tutoronline.controllers;

import com.example.tutoronline.entities.AccountEntity;
import com.example.tutoronline.entities.ResponseObject;

import com.example.tutoronline.repositories.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SignUpController {

    @Autowired
    AuthRepository signUpRespository;

    @PostMapping("/sign-up")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ResponseObject> signup(@RequestBody AccountEntity account) {

        account.setCreatedDate(new Date());
        account.setModifiedDate(new Date());

        AccountEntity result = signUpRespository.save(account);

        if (result.getId() != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseObject("ok", "message", result));
        } else {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseObject("ok", "message", new AccountEntity()));
        }

    }
    @RequestMapping("/check-mail")
    @CrossOrigin(origins = "http://localhost:3000")
    public boolean checkMail(@RequestBody AccountEntity account){
        AccountEntity acc = signUpRespository.findByEmail(account.getEmail());
        if(acc != null){
            return true;
        }
       return false;

    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/update-profile/{id}")
    public ResponseEntity<ResponseObject> updateProfile(@PathVariable(value = "id") Long id, @RequestBody AccountEntity account){
        Optional<AccountEntity> accountOptional = signUpRespository.findById(id);

        if(accountOptional.isPresent()){
            AccountEntity acc = accountOptional.get();
            acc.setDisplayName(account.getDisplayName());
            acc.setPhone(account.getPhone());
            acc.setDistrict(account.getDistrict());
            acc.setCity(account.getCity());
            acc.setGender(account.getGender());


            AccountEntity newAccount = signUpRespository.save(acc);
            System.out.println(newAccount);
            if (newAccount.getId() != null){
                return ResponseEntity.status(HttpStatus.OK).body(
                        new ResponseObject("OK","update profile successful!",newAccount)
                );
            }
        }
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("ERROR","can not update profile",new AccountEntity()));
    }
}
