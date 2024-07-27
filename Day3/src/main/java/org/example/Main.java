package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ievadi skaitli cik garu sarakstu gribi taisit!");
        Scanner sc = new Scanner(System.in);
        int listGarums = sc.nextInt();

        List<Integer> list = new ArrayList();
        int skaitlis = 0;
        for (int i = 0; i < listGarums; i++) {
            System.out.println("Ievadi skaitli!");
            skaitlis = sc.nextInt();
        }
        apstradatList(list);
        izvaditList(list);
    }
    public static void apstradatList(List<Integer> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli no lista ko gribi dzest!");
        int dzestSkaitli1 = sc.nextInt();

        System.out.println("Ievadi otro skaitli no lista ko gribi dzest!");
        int dzestSkaitli2 = sc.nextInt();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == dzestSkaitli1 || list.get(i) == dzestSkaitli2){
                list.remove(i);
            }
        }
    }
    public static void izvaditList(List<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
