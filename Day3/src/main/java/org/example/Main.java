package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Ievadi skaitli cik garu sarakstu gribi taisit!");
            Scanner sc = new Scanner(System.in);
            int listGarums = sc.nextInt();

            while(listGarums < 2){
                System.out.println("Garums nevar but negativs vai mazaks par 2");
                listGarums = sc.nextInt();
            }

            List<Integer> list = new ArrayList();
            int skaitlis = 0;
            for (int i = 0; i < listGarums; i++) {
                System.out.println("Ievadi skaitli!");
                skaitlis = sc.nextInt();
            }
            apstradatList(list);
            izvaditList(list);
        }
        catch(Exception e){
            System.out.println("Nepareiza Ievade");
        }
    }
    public static void apstradatList(List<Integer> list) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ievadi pirmo skaitli no lista ko gribi dzest!");
            int dzestSkaitli1 = sc.nextInt();

            System.out.println("Ievadi otro skaitli no lista ko gribi dzest!");
            int dzestSkaitli2 = sc.nextInt();

            if (list.get(dzestSkaitli1) != null) {
                list.remove(dzestSkaitli1);
            }
            if (list.get(dzestSkaitli2) != null) {
                list.remove(dzestSkaitli2);
            }
        } catch (Exception e) {
            System.out.println("Nepareiza Ievade");
        }
    }
    public static void izvaditList(List<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
