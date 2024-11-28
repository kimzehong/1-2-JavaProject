package chp12.ex12_9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("손예진","111-222-3333",1000000);
        BankAccount b2 = new BankAccount("현빈","555-666-7777",10000001);

        File file = new File("result_account.txt");
        try{
            FileWriter fw = new FileWriter(file);
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
