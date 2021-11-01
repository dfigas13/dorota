package com.company.coderslab;

import java.util.ArrayList;
import java.util.Collections;

public class Main02 {

    public static void main(String[] args) {

        System.out.println("Hallo Java");
        System.out.println("Hallo CodersLab");
        System.out.println();

        byte nr1 = 94;
        short nr2 = 257;
        int result = nr1 + nr2;
        System.out.println("Addition nr1 + nr2: " + result);
        System.out.println();

//        Flow Control Aufgabe2
        int nr3 = 3;
        int nr4 = 7;
        int nr5 = 11;

        if (nr5 > nr4) {
            System.out.println("Die größte Zahl ist " + nr5);
        }  else if (nr5 > nr3) {
            System.out.println("Die größte Zahl ist " + nr5);
        }

        System.out.println();

//        Arrays
        String fruits[] = {"Apple", "Banana", "Berry"};
        System.out.println(fruits[0]);
        System.out.println(fruits[fruits.length -1]);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

//        Paramether

        int number1 = Integer.parseInt(args[0]);
        String num1 = Integer.toString(number1);

        String firstName = String.format(args[1]);

        int number2 = Integer.parseInt(args[2]);
        String num2 = Integer.toString(number2);

        String lastName = String.format(args[3]);
        String all = number1 + " " + firstName + " " + " " + number2 + " " + lastName;

        ArrayList<String>allElementsList = new ArrayList<>();
        allElementsList.add(num1);
        allElementsList.add(firstName);
        allElementsList.add(num2);
        allElementsList.add(lastName);

        Collections.reverse(allElementsList);

        System.out.println(allElementsList);




    }
}
