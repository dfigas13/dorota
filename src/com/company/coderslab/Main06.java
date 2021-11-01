package com.company.coderslab;

public class Main06 {


    public static void main(String[] args) {
//        t hat gefahlt
        System.out.println("Hello world\n");


        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1 && bool2);
        System.out.println(bool1 || bool2);
        System.out.println(!bool1);

        System.out.println();

        System.out.println("FLOW CONTROL");
        System.out.println("FOR SCHLEIFE: ");
        int n = 6;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println( i +" - gerade");
            } else {
                System.out.println( i + "- ungerade");
            }
        }

        System.out.println();
        System.out.println("WHILE SCHLEIFE: ");
        int counter = 0;
        while(counter <= n) {
            if (counter % 2 == 0) {
                System.out.println(counter + " - gerade");
            } else {
                System.out.println(counter + " - ungerade");
            }
            counter++;
        }

        System.out.println();

        System.out.println("ARRAYS");
        int[] numbers = {4,643,112,9999,-69};
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("PARAMETHERS: ");
        int n1 = Integer.parseInt(args[0]);
        int average = 0;
        for (int i = 1 ; i <=n1; i++) {
            for (int j = 1; j <= n1 ; j++) {
                average =  i * j;
                System.out.println(i + " x " +  j + " = " + average);
            }
            System.out.println("");
        }







    }


}
