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
        String vards1 = "";
        int vecums1 = 0;
        String veids1 = "";
        String vards2 = "";
        int vecums2 = 0;
        String veids2 = "";
        String vards3 = "";
        int vecums3 = 0;
        String veids3 = "";
        for (int i = 0; i < 9; i++){
            System.out.println("Ievadi 1. dzivvnieka vardu!");
            vards1 = sc.nextLine();
            System.out.println("Ievadi 1. dzivnieka vecumu!");
            vecums1 = sc.nextInt();
            System.out.println("Ievadi 1.dzivnieka veidu!");
            sc.nextLine();
            veids1 = sc.nextLine();
            System.out.println("Ievadi 2. dzivnieka vardu!");
            vards2 = sc.nextLine();
            System.out.println("Ievadi 2. dzivnieka vecumu");
            vecums2 = sc.nextInt();
            System.out.println("Ievadi 2. dzivnieka veidu!");
            sc.nextLine();
            veids2 = sc.nextLine();
            System.out.println("Ievadi 3. dzivnieka vardu");
            vards3 = sc.nextLine();
            System.out.println("Ievadi 3. dzivnieka vecumu");
            vecums3 = sc.nextInt();
            System.out.println("Ievadi 3. dzivnieka veidu!");
            sc.nextLine();
            veids3 = sc.nextLine();
        }

        Pet pet1 = new Pet(vards1, vecums1, veids1);
        Pet pet2 = new Pet(vards2, vecums2, veids2);
        Pet pet3 = new Pet(vards3, vecums3, veids3);

        List<Pet> petList = new ArrayList<>();
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);

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