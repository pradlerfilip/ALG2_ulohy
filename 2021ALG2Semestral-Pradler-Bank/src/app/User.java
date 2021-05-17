package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class User
{
    protected String username;
    protected String password;
    protected char symbol;

    public User(String username, String password, char symbol)
    {
        this.username = username;
        this.password = password;
        this.symbol = symbol;
    }

    public String getUsername()
    {
        return username;
    }

    public void addAccount(Account account)
    {
    }

    public void printAccounts()
    {
    }


    public void loadAccounts() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(this.getUsername() + "/accounts.txt"));
        System.out.println("All accounts loaded");
        for(String line : lines) {
            String[] line_array = line.split(";");
            Account account = new Account(Integer.parseInt(line_array[0]),Double.parseDouble(line_array[1]),AccountType.valueOf(line_array[2]),AccountStatus.valueOf(line_array[3]));
            addAccount(account);
        }
    }



}
