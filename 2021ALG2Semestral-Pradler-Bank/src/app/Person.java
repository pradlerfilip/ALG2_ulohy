package app;

import java.util.ArrayList;

public class Person extends User
{
    protected String name;
    protected String surname;
    protected String address;
    protected char gender;
    protected int pID;
    protected int telNumber;
    protected ArrayList<Account> accounts;

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

    @Override
    public void addAccount(Account account)
    {
        this.accounts.add(account);
    }

    @Override
    public void printAccounts()
    {
        for(Account account : accounts)
        {
            System.out.println(account.toString());
        }
    }







}
