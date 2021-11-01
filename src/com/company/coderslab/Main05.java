package com.company.coderslab;

public class Main05 {
    public static void main(String[] args) {
//        strich punkt hat gefahlt
        System.out.println("Hello world");

        double nr1 = 5.1d;
        float nr2 = 5.0f;
        boolean result = nr1 > nr2;
        System.out.println("Ist erse Wert größer als das zweite? : " + result);
        System.out.println();


        System.out.println("FLOW CONTROL: ");
        int resultFor = 0;
        int resultWhile = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println(resultFor += i);
        }

        System.out.println();

        int counter = 1;
        while (counter < 11) {
            System.out.println(resultWhile += counter);
            counter++;
        }


        System.out.println();
        System.out.println("ARRAYS: ");
        int numbers[] = {4, 643, 112, 9999, -69};
        int min = 0;

        for (int item : numbers) {
            if (item < min) {
                min = item;
            }
        }
        System.out.println(min);

        System.out.println("PARAMETHER: ");
        int points = Integer.parseInt(args[0]);
        String message = "Bad Value";

        if (points < 0) {
            System.out.println(message);
        } else if (points > 100) {
            System.out.println(message);
        } else if (points > 0 && points < 50) {
            System.out.println("Du hast " + points + " pkt => " + " 0 - 50 Punkte = F");
        } else if (points > 50 && points < 70) {
            System.out.println("Du hast " + points + " pkt => " + " 51 - 70 Punkte = E");
        } else if (points > 70 && points < 90) {
            System.out.println("Du hast " + points + " pkt => " + " 71 - 90 Punkte = C");
        } else if (points > 90 && points <= 100) {
            System.out.println("Du hast " + points + " pkt => " + " 91 - 100 Punkte = A");
        }


    }
}
