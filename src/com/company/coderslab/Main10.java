package com.company.coderslab;

public class Main10 {
    public static void main(String[] args) {

//        aufgabe10 flow control????
        int n = 6;
        for (int i = 1; i < 11; i++) {
            System.out.print(i + "  ");
            for (int j = 1; j < n; j++) {
                if (j <= i) {
                    System.out.print("*");
                    /*}else if () {*/


                } else {
                    System.out.print(j);
                }
            }
						
						
					/*	  int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n ; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }*/
				
				

           /* for (int m = 1; m < n ; m++) {
                if(m <= i ) {
                    System.out.print(m);
                } else {
                    System.out.print("*");
                }
            }*/
            System.out.println();
        }

        System.out.println("#######################");
        String[] nameOfUsers = {"Alice", "John", "Melanie"};
        System.out.println(nameOfUsers[0]);
        System.out.println(nameOfUsers[1]);
        System.out.println(nameOfUsers[2]);



    }


}
