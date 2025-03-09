package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("1.Write in File");
            System.out.println("2.Read in File");
            System.out.println("3.Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 -> {
                    Writer writer = new Writer();
                    System.out.print("Enter a File name to write: ");
                    String fileName = sc.nextLine();
                    System.out.print("Enter content to write :");
                    String content = sc.nextLine();
                    writer.writeIntoFile(fileName,content);
                }
                case 2 -> {
                    Reader reader = new Reader();
                    System.out.print("Enter a File name to read: ");
                    reader.readFromFile(sc.next());
                }
                case 3 -> {

                }default -> System.out.println("Invalid choice");
            }
        }

    }
}
