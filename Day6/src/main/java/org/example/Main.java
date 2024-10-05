package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ievadi skaitli!");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while(a != 0){

            switch(a){
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ievadits cits skaitlis");
                    break;
            }
        }
    }
}