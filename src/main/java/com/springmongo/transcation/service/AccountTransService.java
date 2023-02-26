package com.springmongo.transcation.service;

import com.springmongo.transcation.dao.AccountTransactionDao;
import com.springmongo.transcation.mapper.AccountTransMapper;
import com.springmongo.transcation.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AccountTransService {
    @Autowired
    private AccountTransactionDao accountTransactionDao;

    @Autowired
    private AccountTransMapper accountTransMapperImpl;

    public String saveAccountDetails(Account account) {

        com.springmongo.transcation.entity.Account accountentity =accountTransMapperImpl.mapModelToEntity(account);
        com.springmongo.transcation.entity.Account accountdao = accountTransactionDao.save(accountentity);
        if(Objects.nonNull(accountdao)){
            return "Given record inserted successfully in mongoDB";
        }
        return null;

    }
}
