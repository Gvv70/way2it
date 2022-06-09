package com.company;

public class Account {
    private String debitAccount;
    private int creditAccount;

    public Account(String debitAccount, int creditAccount) {
        this.debitAccount = debitAccount;
        this.creditAccount = creditAccount;
    }

    public Account(String debitAccount) {
        this.debitAccount = debitAccount;
    }

    public Account(int creditAccount) {
        this.creditAccount = creditAccount;
    }

    public String getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(String debitAccount) {
        this.debitAccount = debitAccount;
    }

    public int getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(int creditAccount) {
        this.creditAccount = creditAccount;
    }
}
