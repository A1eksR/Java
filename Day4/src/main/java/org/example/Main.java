package org.example;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pet> newPetList = readFile();
        if(newPetList.isEmpty()){
            System.out.println("Saraksts ir tuks");
        }
        else{
            for(int i = 0; i < newPetList.size(); i++){
                System.out.println(newPetList.get(i));
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ko velies darit ? 1-pievienot jaunu dzivnieku; 2- iziet");
        int atbilde = -1;

        while(atbilde != 2){
            atbilde = sc.nextInt();
            switch(atbilde){
                case 1:
                    System.out.println("Cik daudzus dzivniekus gribi pievienot?");
                    int petSkaits = sc.nextInt();
                    ievaditPet(newPetList, petSkaits);
                    writeToFile(newPetList);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("ievadits cits skaitlis");
                    break;
            }
        }


    }
    public static void writeToFile(List<Pet> newPetList){
        Gson gson = new Gson();
        String json = gson.toJson(newPetList);
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
    private static List<Pet> readFile(){
        List<Pet> newPetList;
        Gson gson = new Gson();
        try{
            String content = Files.readString(Path.of("filename.txt"), StandardCharsets.UTF_8);
            newPetList = List.of(gson.fromJson(content, Pet[].class));
        }catch (IOException e){
            newPetList = new ArrayList<>();
        }
        return newPetList;
    }
    public static void ievaditPet(List<Pet> newPetList, int petSkaits){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < petSkaits; i++){
            System.out.println("Ievadi dzivvnieka vardu, vecumu un veidu!");
            String vards1 = sc.nextLine();
            int vecums1 = sc.nextInt();
            sc.nextLine();
            String veids1 = sc.nextLine();
            newPetList.add(new Pet(vards1, vecums1, veids1));
        }
    }
}