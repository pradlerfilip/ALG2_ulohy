package ui;

import app.Account;
import app.Bank;
import app.Person;
import app.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileTools;


public class UI {
    private Bank bank;
    private User currentUser=null;
    private Scanner sc = new Scanner(System.in);

    public UI(Bank bank)
    {
        this.bank = bank;
    }

    public User getUserByUsername(String username) throws Exception {
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
                if(loginSuccesfully())
                {
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

    public void runMenu()
    {
        FileTools.createFolder(currentUser.getUsername());
        FileTools.createFile(currentUser.getUsername() + "/" + "accounts.txt");
        System.out.println("*****************");
        System.out.println("1: Create Account");
        System.out.println("*****************");
        System.out.print("Your choose: ");
        int choose = sc.nextInt();
    }

    public void registerPerson()
    {
        System.out.print("Choose username: ");
        String username = sc.next();
        if(FileTools.searchFile("users.txt", username,0))
        {
            while(FileTools.searchFile("users.txt", username, 0))
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
    }

    public void registerCompany()
    {
        //TODO
    }

    public void loginUser() throws Exception {
        System.out.print("Your username: ");
        String username = sc.next();
        System.out.print("Your password: ");
        String password = sc.next();
        if(FileTools.searchFile("users.txt",username,1) && FileTools.searchFile("users.txt",password,2))
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


}
