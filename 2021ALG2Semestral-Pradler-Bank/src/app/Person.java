package app;

import java.util.ArrayList;

/**
 *
 * @author filip
 */



public class Person extends User
{
    private String name;
    private String surname;
    private String address;
    private char gender;
    private int pID;
    private int telNumber;
    private ArrayList<Account> accounts;

    public Person(String username, String password, ArrayList<Account> accounts,String name, String surname, char gender, String address, int pID, int telNumber)
    {
        super(username,password, 'p');
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.accounts = accounts;
        this.address = address;
        this.pID = pID;
        this.telNumber = telNumber;
    }

    @Override
    public String toString()
    {
        return symbol + ";" + username + ";" + password + ";" + name + ";" + surname + ";" + address + ";" + gender + ";" + pID + ";" + telNumber;
    }

    public void createAccount(double balance, AccountType type)
    {
        Account a1 = new Account(balance,type);
        a1.setOwner(this);
        addAccount(a1);
    }


    public void addAccount(Account account)
    {
        this.accounts.add(account);
    }







}
