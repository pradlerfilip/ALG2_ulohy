package app;

import java.io.IOException;
import java.util.ArrayList;
import utils.FileTools;

/**
 *
 * @author filip
 */
public class Bank
{
    public String name;
    public String address;
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
            FileTools.appendToFile("users.txt",user.toString());
        }
    }

    public void loadUsers() throws IOException {
        if(!FileTools.fileExists("users.txt"))
        {
            FileTools.createFile("users.txt");
        }
        else
        {
            FileTools.loadUsers(this);
        }
    }

}