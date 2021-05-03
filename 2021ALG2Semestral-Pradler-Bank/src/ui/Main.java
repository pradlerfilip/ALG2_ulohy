package ui;

import app.Bank;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author filip
 */
public class Main {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Bank bank = new Bank("My bank", "Liberec");
        bank.loadUsers();
        UI ui = new UI(bank);
        ui.runIntro();
        ui.runLogin();
    }

}
