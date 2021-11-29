package com.company.coderslab;

import java.util.ArrayList;

public class Main03 {

    public static void main(String[] args) {
        System.out.println("Today I am starting the" + "\n" + "Java Coure" + "\n" + "in CodersLab");
        System.out.println();

        int nr1 = 5;
        int nr2 = 3;
        int result = nr1 % nr2;
        System.out.println("Modulo Ergebniss: " + result);
        System.out.println();

        System.out.println("FLOW CONTROLS");
        System.out.println("FOR SCHLEIFE: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Java");
        }
        System.out.println("WHILE SCHLEIFE: ");
        int counter = 0;
        while(counter < 3) {
            System.out.println("Java");
            counter++;
        }
        System.out.println();

        System.out.println("ARRAYS");
        int numbers[] = {4,643,112,9999,69};
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println("SUMME: " + sum + "\n");

        System.out.println("PARAMETHER: ");
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(num1);
        numberList.add(num2);
        numberList.add(num3);
        numberList.add(num4);


        int average = 0;
        for (int number : numberList) {
            average = average + number;
        }
        System.out.println("DURCHSCHNITT: " + average / numberList.size());




    }
}
