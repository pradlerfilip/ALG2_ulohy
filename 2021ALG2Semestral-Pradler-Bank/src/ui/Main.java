package ui;

import app.Bank;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author filip
 */
public class Main {

    final static Scanner sc = new Scanner(System.in);

    public static final String bankName = "My bank";
    public static final String bankAddress = "Liberec";


    public static void main(String[] args) throws Exception
    {
        Bank bank = new Bank(bankName, bankAddress);
        bank.loadUsers();
        UI ui = new UI(bank);
        ui.runIntro();
        ui.runLogin();
    }

}
