package utils;

import app.Account;
import app.Bank;
import app.Person;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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

    public static void createFile(String filename)
    {
        try
        {
            File users = new File(filename);
            if (users.createNewFile())
            {
                System.out.println("File created: " + users.getName());
            }
            else
            {
                System.out.println("Users.txt loaded");
            }
        }catch(IOException e)
        {
            System.out.println("Error with writing to " + filename);
            e.printStackTrace();
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
            List<String> lines = Files.readAllLines(Paths.get("users.txt"));
            System.out.println("Users loaded");
            for(String line : lines) {
                String[] line_array = line.split(";");
                if ("p".equals(line_array[0])) {
                    Person person = new Person(line_array[1], line_array[2], new ArrayList<Account>(), line_array[3], line_array[4], line_array[5].charAt(0), line_array[6], Integer.parseInt(line_array[7]), Integer.parseInt(line_array[8]));
                    bank.addUser(person,false);
                }
                else
                {
                    break;
                }
            }
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
            FileWriter myWriter = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(input);
            bw.newLine();
            bw.close();
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
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                String data_array[] = data.split(";");
                if(data_array[index].matches(input))
                {
                    return true;
                }

            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error with finding username");
            e.printStackTrace();
        }
        return false;
    }

}

