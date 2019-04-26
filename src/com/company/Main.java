package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
   private static void generateMap(int x){

        int [][]map = new int[3][x];
        int [][]dist= new int [x][x];
        int iteration1=0;
        for(int i=0;i<=x-1;i++){

            Random generator = new Random();
            int j=0;
            map[j][i]= iteration1;
            map[j+1][i]=generator.nextInt(31);
            map[j+2][i]=generator.nextInt(31);
            iteration1++;
        }

       for(int i=0;i<=x-1;i++){
           for(int j=0;j<=3;j++){
               System.out.println(map[i][j]);
           }
           System.out.println("mmmm");
       }

        for(int i=0;i<=x-1;i++){
           for(int j=0;j<=x-1;j++){
               int x1=map[1][i];
               int x2=map[1][j];
               int y1=map[2][i];
               int y2=map[2][j];

               double result=Math.sqrt((x1-x2)^2+(y1-y2)^2);
               System.out.println(Integer.valueOf((int) result));

           }
        }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj do ilu miast chcesz wyslac komiwojazera");
        String i = scanner.nextLine();
        System.out.println("Liczba miast " + i);
        int liczbaMiast= Integer.parseInt(i);
        generateMap(liczbaMiast);

    }
}
