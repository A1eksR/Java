package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Ievadi cik garu gribi Listu!");
            Scanner sc = new Scanner(System.in);
            int garums = sc.nextInt();
            List<String> list = new ArrayList<>();
            sc.nextLine();
            for(int i = 0; i < garums; i++){
                System.out.println("Ievadi lista elementu");
                String ievade = sc.nextLine();
                list.add(ievade);
            }

            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                for(int i = 0; i < list.size(); i++){
                    myWriter.write(list.get(i) + "\n");
                }
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try {
                File myObj = new File("filename.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println("Fila elementi: " + data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}