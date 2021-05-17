package app;

import java.io.IOException;
import java.util.ArrayList;

import utils.BankTools;
import utils.FileTools;

/**
 *
 * @author filip
 */
public class Bank
{
    public String name;
    public String address;
    public String bankCode = "0" + Long.toString(BankTools.getRandomNumber(100,999));
    private ArrayList<User> users = new ArrayList<User>();

    public Bank(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }

    public void addUser(User user,boolean write)
    {
        this.users.add(user);
        if(write)
        {
            FileTools.appendToFile("users.csv",user.toString());
        }
    }

    public void addAccountNumber(Account account)
    {
        FileTools.appendToFile("accounts.csv", Long.toString(account.getNumber()));
    }

    public void loadUsers() throws IOException {
        if(!FileTools.fileExists("users.csv"))
        {
            FileTools.createFile("users.csv");
            FileTools.appendToFile("users.csv","symbol,username,password,accounts,name,surname,gender,address,pID,telNumber");
        }
        else
        {
            FileTools.loadUsers(this);
        }
    }

}