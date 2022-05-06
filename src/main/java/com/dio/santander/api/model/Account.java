package com.dio.santander.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Account {

    @Column (name = "account_number" )
    private Long number;

    @Column (name = "account_balance" )
    private Double balance;
    
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}