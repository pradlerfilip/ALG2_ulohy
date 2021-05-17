package ui;

import app.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;
import utils.BankTools;
import utils.FileTools;


public class UI {
    private Bank bank;
    private User currentUser=null;

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    private Scanner sc = new Scanner(System.in);

    public UI(Bank bank)
    {
        this.bank = bank;
    }


    public User getUserByUsername(String username) throws Exception
    {
        for(User user:bank.getUsers())
        {
            if(user.getUsername().equals(username))
            {
                return user;
            }
        }throw new Exception("User doesnt exists");
    }


    public void runIntro()
    {
        System.out.println();
        System.out.println("Welcome to bank: " + bank.name);
        System.out.println("Adress: " + bank.address);
        System.out.println();
    }

    public void runLogin() throws Exception {
        while(true) {
            System.out.println();
            System.out.println(LocalDate.now());
            System.out.println("*****************");
            System.out.println("1: Login user");
            System.out.println("2: Register user");
            System.out.println("0: Exit");
            System.out.println("*****************");
            System.out.print("Your choose: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    loginUser();
                    if (loginSuccesfully()) {
                        runMenu();
                    }
                    break;
                case 2:
                    registerPerson();
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }

    public void runMenu() throws IOException {
        currentUser.loadAccounts();
        while(true) {
            System.out.println();
            System.out.println(LocalDate.now());
            System.out.println("*****************");
            System.out.println("1: Create Account");
            System.out.println("2: Show accounts");
            System.out.println("0: Sign off");
            System.out.println("*****************");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    signOutUser();
                    return;
                case 1:
                    createAccount();
                    break;
                case 2:
                    currentUser.printAccounts();
            }
        }
    }

    public void registerPerson() throws IOException {
        System.out.print("Choose username: ");
        String username = sc.next();
        if(FileTools.searchFile("users.csv", username,1))
        {
            while(FileTools.searchFile("users.csv", username, 1))
            {
                System.out.print("Username taken, use different: ");
                username = sc.next();
            }
        }
        System.out.print("Choose password: ");
        String password = sc.next();
        System.out.print("Choose name: ");
        String name = sc.next();
        System.out.print("Choose surname: ");
        String surname = sc.next();
        System.out.print("Choose address: ");
        String address = sc.next();
        System.out.print("Choose gender: ");
        char gender = sc.next().charAt(0);
        System.out.print("Choose personal ID: ");
        int pID = sc.nextInt();
        System.out.print("Choose phone number: ");
        int telNumber = sc.nextInt();
        ArrayList<Account> accounts = new ArrayList<Account>();
        Person person = new Person(username, password, accounts, name, surname, gender, address, pID, telNumber);
        bank.addUser(person,true);
        FileTools.createFolder(username);
        FileTools.createFile(username + "/" + "accounts.csv");
    }

    public void createAccount()
    {
        long number = BankTools.getUniqueAccountNumber();
        System.out.print("Your balance: ");
        double balance = sc.nextDouble();
        System.out.println("NORMAL,SAVINGS,RETIREMENT,INVESTMENT,TRANSPARENT");
        System.out.print("Your type of account: ");
        String accountType_str = sc.next();
        AccountType accountType = AccountType.valueOf(accountType_str.toUpperCase());
        Account account = new Account (number,balance,accountType);
        FileTools.appendToFile("accounts.csv",Long.toString(number));
        currentUser.addAccount(account);
        FileTools.appendToFile(currentUser.getUsername() + "/accounts.csv", account.toString());
    }


    public void registerCompany()
    {
        //TODO
    }

    public void loginUser() throws Exception
    {
        System.out.print("Your username: ");
        String username = sc.next();
        System.out.print("Your password: ");
        String password = sc.next();
        if(FileTools.searchFile("users.csv",username,1) && FileTools.searchFile("users.csv",password,2))
        {
            System.out.println("Login successfully");
            currentUser = getUserByUsername(username);
        }
        else
        {
            System.out.println("Wrong username or password");
            loginUser();
        }
    }

    public boolean loginSuccesfully()
    {
        if(currentUser!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void signOutUser()
    {
        System.out.println(currentUser.getUsername() + " signed out successfully");
        setCurrentUser(null);
    }


}
