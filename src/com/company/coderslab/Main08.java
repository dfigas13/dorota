package com.company.coderslab;

public class Main08 {
    public static void main(String[] args) {

    int n = 6;
        for (int i = 1; i < n; i++) {
            System.out.print(i + "  ");
            for (int j = 1; j < n ; j++) {
                if(j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("PARAMETHER: ");

        int x = Integer.parseInt(args[0]);
        int z = Integer.parseInt(args[1]);
//        Prüft welche Zahl ist größer?
        /*if(x > z) {
            System.out.println("x größer als z");
            double average = x / z ;
            System.out.println(average);
        }else if(x < z) {
            System.out.println("x kleiner als z");
        } else if (x == z) {
            System.out.println("x und y sind gleich groß");
        }*/

        if(x > z) {
            int average = x/z;
            int avg2 = average * z;
            int result = x - avg2;
            System.out.println(result);

        }








    }
}
