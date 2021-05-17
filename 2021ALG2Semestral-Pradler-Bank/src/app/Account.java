package app;

import java.util.ArrayList;

public class Account {
    private long number;
    private Person owner;
    private double balance;
    private AccountType type;
    private ArrayList<Transfer> transfers = new ArrayList<Transfer>();
    private AccountStatus status = AccountStatus.OPEN;

    public Account(long number,double balance,AccountType type)
    {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
        this.type = type;
    }

    public long getNumber() {
        return number;
    }

    public Account(long number, double balance, AccountType type, AccountStatus status)
    {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
        this.type = type;
        this.status = status;
    }

    @Override
    public String toString()
    {
        return number + ";" + balance + ";" + type + ";" + status;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
