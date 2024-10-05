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
        FileOperations.vaiFileIrTuks();
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
                    FileOperations.writeToFile(newPetList);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("ievadits cits skaitlis");
                    break;
            }
        }

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