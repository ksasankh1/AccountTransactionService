package com.springmongo.transcation.dao;

import com.springmongo.transcation.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTransactionDao extends MongoRepository<Account,String> {

}
