package com.company;

import java.util.Objects;

public class User extends Account{
    private String user;
    private double sumDebitAccount;
    private double sumCreditAccount;

    public User(String user, String debitAccount, double sumDebitAccount, int creditAccount, double sumCreditAccount) {
        super(debitAccount, creditAccount);
        this.user = user;
        this.sumDebitAccount = sumDebitAccount;
        this.sumCreditAccount = sumCreditAccount;
    }

    public double getSumDebitAccount() {
        return sumDebitAccount;
    }

    public void setSumDebitAccount(double sumDebitAccount) {
        this.sumDebitAccount = sumDebitAccount;
    }

    public double getSumCreditAccount() {
        return sumCreditAccount;
    }

    public void setSumCreditAccount(double sumCreditAccount) {
        this.sumCreditAccount = sumCreditAccount;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Double.compare(user1.sumDebitAccount, sumDebitAccount) == 0 && Double.compare(user1.sumCreditAccount, sumCreditAccount) == 0 && user.equals(user1.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, sumDebitAccount, sumCreditAccount);
    }

    @Override
    public String toString() {
        return "User{" +
                "user = '" + user + '\'' +
                "; DebitAccount - " + getDebitAccount() +
                ", sumDebitAccount = " + sumDebitAccount +
                "; CreditAccount " + getCreditAccount() +
                ", sumCreditAccount = " + sumCreditAccount +
                '}';
    }
}
