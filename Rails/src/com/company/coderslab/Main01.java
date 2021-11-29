package com.company.coderslab;

public class Main01 {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println();

        int integer1 = 22;
        char char1 = 'A';
        long long1 = 12334444445455L;
        double double1 = 123.45;
        boolean bool1 = true;

        int nr1 = 3;
        int nr2 = 7;

        if (nr2 > nr1) {
            System.out.println("Die größere Zahl ist " + nr2);
        }

        System.out.println();
//        Arrays
        int threeElements[] = {3, 4, 5};
        System.out.print(threeElements[0] + " " + threeElements[1] + " " + threeElements[2]);

        System.out.println();

        //Paramether
        /*int param2 = Integer.parseInt(args[2]);
        System.out.println("\n" +param2);*/
        int number1 = Integer.parseInt(args[0]);
        String firstName = String.format(args[1]);
        int number = Integer.parseInt(args[2]);
        String lastName = String.format(args[3]);
        System.out.println(number1 + " " + firstName + " " + " " + number + " " + lastName);


    }
}
