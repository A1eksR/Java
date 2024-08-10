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
        System.out.println("Ievadi 1. dzivnieka vardu, vecumu un veidu)");
        Scanner sc = new Scanner(System.in);
        String vards1 = sc.nextLine();
        int vecums1 = sc.nextInt();
        sc.nextLine();
        String veids1 = sc.nextLine();

        System.out.println("Ievadi 2. dzivnieka vardu, vecumu un veidu)");
        String vards2 = sc.nextLine();
        int vecums2 = sc.nextInt();
        sc.nextLine();
        String veids2 = sc.nextLine();

        System.out.println("Ievadi 3. dzivnieka vardu, vecumu un veidu)");
        String vards3 = sc.nextLine();
        int vecums3 = sc.nextInt();
        sc.nextLine();
        String veids3 = sc.nextLine();

        Pet pet1 = new Pet(vards1, vecums1, veids1);
        Pet pet2 = new Pet(vards2, vecums2, veids2);
        Pet pet3 = new Pet(vards3, vecums3, veids3);

        List<Pet> petList = new ArrayList<>();
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);

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