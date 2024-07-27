package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int skaitlis = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ievadi skaitli");
            skaitlis = sc.nextInt();
            list.add(skaitlis);
        }
    }
    public static List apstradatListu(List<Integer> list){
        Scanner sc = new Scanner(System.in);
        int jaunaisSkaitlis;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 0){
                System.out.println("Ievadi citu skaitli jo sis ir 0");
                jaunaisSkaitlis = sc.nextInt();
                list.set(i, jaunaisSkaitlis);
            }
        }
        return list;
    }
    public static void izvaditListu(List<Integer> list){
        for(int i =0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
    }
}