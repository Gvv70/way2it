package com.company;

import java.util.ArrayList;
import java.util.List;

public class AccountsHuman {

    private double account;
    private List<Double> listAccountsHuman = new ArrayList<>();

    public AccountsHuman() { // конструктор
        this.account = account;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public List<Double> getListAccountsHuman() {
        return listAccountsHuman;
    }

    public void setListAccountsHuman(List<Double> listAccountsHuman) {
        this.listAccountsHuman = listAccountsHuman;
    }
    public void addListAccountsHuman(double account){
        this.listAccountsHuman.add(account);
    }
}
