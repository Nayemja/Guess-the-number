package com.javabegin;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
//mini project
Scanner sc = new Scanner(System.in);
int mynumber = (int )(Math.random()*1000);
int usernumber;
do {
    System.out.println("guess my number");
     usernumber = sc.nextInt();

    if (usernumber == mynumber) {
        System.out.println("Bravo !! ");
        break;
    } else if (usernumber > mynumber) {
        System.out.println("too large");
    } else {
        System.out.println("too small");
    }
}while(usernumber >=0);
        System.out.println("My number is");

        System.out.println(mynumber);




        }
    }


