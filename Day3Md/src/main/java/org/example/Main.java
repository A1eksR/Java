package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ievadi cik garu gribi Listu!");
        Scanner sc = new Scanner(System.in);
        int garums = sc.nextInt();
        List<String> list = new ArrayList<>();
        String ievade = "";
        for(int i = 0; i < garums; i++){
            ievade = sc.nextLine();
            list.add(ievade);
        }
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for(int i = 0; i < list.size(); i++){
                myWriter.write(list);
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}