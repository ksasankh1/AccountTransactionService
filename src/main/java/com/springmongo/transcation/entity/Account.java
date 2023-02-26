package com.springmongo.transcation.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection = "accounttrans")
public class Account extends Transactions{
    @Id
    public String id;
    public Date accountCreateTS;
    public String primaryName;
    public String email;

    List<Transactions> transactions = new ArrayList<Transactions>();

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getAccountCreateTS() {
        return accountCreateTS;
    }

    public void setAccountCreateTS(Date accountCreateTS) {
        this.accountCreateTS = accountCreateTS;
    }

    public String getPrimaryName() {
        return primaryName;
    }

    public void setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
