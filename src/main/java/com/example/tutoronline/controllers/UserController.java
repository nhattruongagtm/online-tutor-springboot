package com.example.tutoronline.controllers;

import com.example.tutoronline.entities.AccountEntity;
import com.example.tutoronline.entities.ResponseObject;
import com.example.tutoronline.repositories.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    AuthRepository userRespository;

    @PutMapping("/user/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ResponseObject> changePassword(@PathVariable(value = "id") Long id, @RequestBody String newPassword){
        Optional<AccountEntity> accountOptional = userRespository.findById(id);

        if(accountOptional.isPresent()) {
            AccountEntity account = accountOptional.get();

            account.setPassword(newPassword);
            AccountEntity newAccount = userRespository.save(account);
            System.out.println(newAccount.getId());
            if (newAccount.getId() != null) {
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("OK", "change password successfully!", newAccount));
            } else return ResponseEntity.status(HttpStatus.OK).body(null);
        }
     else {
        return ResponseEntity.status(HttpStatus.OK).body(null);
        }
    }

    @GetMapping("/user")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<AccountEntity> getAllUsers(){
       return userRespository.findAll();
    }
}
