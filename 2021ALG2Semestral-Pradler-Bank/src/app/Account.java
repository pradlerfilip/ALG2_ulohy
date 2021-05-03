package app;

import java.util.ArrayList;

/**
 *
 * @author filip
 */

enum AccountType
{
    NORMAL,SAVINGS,RETIREMENT,INVESTMENT,TRANSPARENT
}

enum AccountStatus
{
    OPEN,CLOSED
}

public class Account {
    private int number;
    private Person owner=null;
    private double balance;
    private AccountType type;
    private ArrayList<Transfer> transfers = new ArrayList<Transfer>();
    private AccountStatus status = AccountStatus.OPEN;

    public Account(double balance,AccountType type)
    {
        this.owner = owner;
        this.balance = balance;
        this.type = type;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
