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
        if(newPetList == null){
            System.out.println("Saraksts ir tuks");
        }
        else{
            for(int i = 0; i < newPetList.size(); i++){
                System.out.println(newPetList.get(i));
            }
        }
        Scanner sc = new Scanner(System.in);
        List<Pet> petList = new ArrayList<>();
        System.out.println("Vai velies ievadit jaunu majsdzivnieku ? j(ja) n(ne)");
        String atbile = sc.nextLine();
        if(atbile == "j" || atbile == "ja"){
            System.out.println("Cik daudzus dzivniekus gribi pievienot?");
            int petSkaits = sc.nextInt();
            for (int i = 0; i < petSkaits; i++){
                System.out.println("Ievadi dzivvnieka vardu, vecumu un veidu!");
                String vards1 = sc.nextLine();
                int vecums1 = sc.nextInt();
                sc.nextLine();
                String veids1 = sc.nextLine();
                petList.add(new Pet(vards1, vecums1, veids1));
            }
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
    private static List<Pet> readFile(){
        List<Pet> petList;
        Gson gson = new Gson();
        try{
            String content = Files.readString(Path.of("filename.txt"), StandardCharsets.UTF_8);
            petList = List.of(gson.fromJson(content, Pet[].class));
        }catch (IOException e){
        petList = new ArrayList<>();
        }
        return petList;
    }
}