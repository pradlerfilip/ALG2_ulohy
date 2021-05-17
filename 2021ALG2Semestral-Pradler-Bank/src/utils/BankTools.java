package utils;


import java.util.concurrent.ThreadLocalRandom;

public class BankTools {

    public static long getUniqueAccountNumber()
    {
        long number = getRandomNumber(10000000,99999999);
        while(FileTools.searchFile("accounts.txt",Long.toString(number),0)) {
            number = getRandomNumber(10000000,99999999);
        }
        return number;
    }

    public static long getRandomNumber(long min,long max)
    {
        return ThreadLocalRandom.current().nextLong(min, max);
    }
}
