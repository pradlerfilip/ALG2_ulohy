package utils;

import app.Account;
import app.Bank;
import app.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author filip
 */

public class FileTools {

    public static void createFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists())
        {
            file.createNewFile();
            System.out.println("CSV file created: " + file.getName());
        }
        else
        {
            System.out.println(filename +  "loaded");
        }
    }

    public static void createFolder(String filename)
    {
        File dir = new File(filename);
        if (!dir.exists()){
            dir.mkdirs();
        }
    }

    public static void loadUsers(Bank bank) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("users.csv"));
        String line = "";
        while ((line = csvReader.readLine()) != null) {
                String[] row = line.split(",");
                if ("p".equals(row[0])) {
                    Person person = new Person(row[1], row[2], new ArrayList<Account>(), row[3], row[4], row[5].charAt(0), row[6], Integer.parseInt(row[7]), Integer.parseInt(row[8]));
                    bank.addUser(person,false);
                }
                else
                {
                    break;
                }
            }
        System.out.println("Users loaded");
    }


    public static boolean fileExists(String filename)
    {
        File file = new File(filename);
        if (file.exists())
            return true;
        else
            return false;
    }

    public static void appendToFile(String filename, String input)
    {
        try
        {
            PrintWriter csvWriter = new PrintWriter(filename);
            StringBuilder sb = new StringBuilder();
            sb.append(input);
            sb.append("\n");
            csvWriter.write(sb.toString());
            csvWriter.close();
        } catch (IOException e)
        {
            System.out.println("Error with writing to " + filename);
            e.printStackTrace();
        }
    }

    public static boolean searchFile(String filename, String input, int index)
    {
        try
        {
            BufferedReader csvReader = new BufferedReader(new FileReader(filename));
            String line = "";
            while ((line = csvReader.readLine()) != null)
            {
                String[] row = line.split(",");
                if(row[index].matches(input))
                {
                    return true;
                }

            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

