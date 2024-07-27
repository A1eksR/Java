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
        for(int i = 0; i < 10; i++){
            System.out.println("Ievadi skaitli");
            skaitlis = sc.nextInt();
            list.add(skaitlis);
        }
        int jaunaisSkaitlis;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 0){
                System.out.println("Ievadi citu skaitli jo sis ir 0");
                jaunaisSkaitlis = sc.nextInt();
               list.get(i) = jaunaisSkaitlis;
            }
        }
        System.out.println(list);

    }
}