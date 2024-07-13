package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cik skaitlus gribi ievadit?");
        Scanner sc = new Scanner(System.in);
        int skaitluDaudzums = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Ievadi " + skaitluDaudzums + " skaitlus");
        int skaitli = 0;
        for(int i = 0; i < skaitluDaudzums; i++){
            skaitli = sc.nextInt();
            list.add(skaitli);
        }
        int result = cikNeparaSkaitli(list);
        System.out.println("Lista ir: " + result + " nepara skaitli");




//        System.out.println("Ievadi 5 skaitlus");
//        Scanner sc = new Scanner(System.in);
//
//        List<Integer> Saraksts1 = new ArrayList<>();
//        int Skaitlis1 = 0;
//        for(int i = 0; i < 5; i++){
//            Skaitlis1 = sc.nextInt();
//            Saraksts1.add(Skaitlis1);
//        }
//
//        System.out.println("Ievadi 5 citus skaitlus!");
//
//        List<Integer> Saraksts2 = new ArrayList<>();
//        int Skaitlis2 = 0;
//        for(int i = 0; i < 5; i++){
//            Skaitlis2 = sc.nextInt();
//            Saraksts2.add(Skaitlis2);
//
//        }
//        int Lielaka = atrastLielako(Saraksts1, Saraksts2);
//        System.out.println(Lielaka);

    }
    public static int atrastLielako(List<Integer> Saraksts1, List<Integer> Saraksts2){
        int Result = 0;
        for(int i = 0; i < Saraksts1.size(); i++){
            Result = Result + Saraksts1.get(i);
        }
        int Result2 = 0;
        for(int i = 0; i < Saraksts2.size(); i++){
            Result2 = Result2 + Saraksts2.get(i);
        }
        if(Result > Result2){
            return Result;
        }
        else{
            return Result2;
        }
    }

    public static int cikNeparaSkaitli(List<Integer> list){
        int cikNepara = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) %2 != 0){
                cikNepara = cikNepara + 1;
            }
        }
        return cikNepara;
    }
}