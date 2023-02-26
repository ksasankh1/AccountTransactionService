package com.springmongo.transcation.controller;

import com.springmongo.transcation.model.Account;
import com.springmongo.transcation.service.AccountTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class TransactionController {

    @Autowired
    private AccountTransService accountTransService;

    @PostMapping("/saveDetails")
    public ResponseEntity<String> saveAccountDetails(@RequestBody Account account){
        if (Objects.nonNull(account)){
            String message = accountTransService.saveAccountDetails(account);
            return new ResponseEntity<>(message, HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Input request Invalid please provide proper request",HttpStatus.BAD_REQUEST);
    }

}
