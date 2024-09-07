package org.example;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pet> petList = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            System.out.println("Ievadi 1. dzivvnieka vardu, vecumu un veidu!");
            String vards1 = sc.nextLine();
            int vecums1 = sc.nextInt();
            sc.nextLine();
            String veids1 = sc.nextLine();
            petList.add(new Pet(vards1, vecums1, veids1));
           
        }
        writeToFile(petList);
    }
    public static void writeToFile(List<Pet> petList){
        Gson gson = new Gson();
        String json = gson.toJson(petList);

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(json);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}