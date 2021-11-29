package com.company.coderslab;

import java.util.ArrayList;

public class Main04 {
    public static void main(String[] args) {

//        Aufgabe 4 von Kurs nicht besonders klar formuliert
        System.out.println("\t" + "J" + "\t\t" + "a" + "\t" + "v" + "\t\t" + "v" + "\t" + "a");
        System.out.println("\t" + "J" + "\t" + "   a  a" + "\t" + "  v" + "\t" + "  v" + "\t" + "   a  a");
        System.out.println(/*"J\t"+*/"\t" + "J" + "\t" + "  aaaaa\t"  + "   v " +"v"+ "\t" + "  aaaaa");
        System.out.println(" JJ\t\t" + " a\t\t" + "a\t" + "v\t" + " a\t\t" + "a");
        System.out.println();

        String str1 = "Java";
        String str2 = "Course";
        String joinedStringses = str1 + " " + str2;
        System.out.println(joinedStringses);
        System.out.println();

//        Flow Control

        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        int counter = 1;
        while(counter < 11) {
            System.out.println(counter);
            counter++;
        }
        System.out.println();
        System.out.println("ARRAYS: ");
        int[] numbers = {4,643,112,9999,69};
        int sumOdd = 0;
//        int[] temp2 = new int[] {};
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int item : numbers) {
            if(item % 2 == 0) {
                temp.add(item);
            } else {
                sumOdd += item;
            }
        }

        for (int elem : temp) {
            System.out.println(elem);
        }
        System.out.println("SUM: " + sumOdd + ".\n");


        System.out.println("PARAMETHERS: ");
//        Dreieck bauen
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if(a+b >c) {
            System.out.println("YES");
        } else if (c+b > a || a+c >b) {
            System.out.println("NO");
        }

    }

}
