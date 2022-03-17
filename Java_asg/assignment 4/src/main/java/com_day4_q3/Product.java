package com_day4_q3;


import java.util.Scanner;
import java.io.File;
public class Product{
    public static void main(String[] args) {
        File File1 = new File("C:\\New folder\\WS\\assignment 4\\data.txt");
        try {
            Scanner doubleScanner = new Scanner(File1);
            double bigDouble = Double.MIN_VALUE; 
            double smallDouble = Double.MAX_VALUE; 
            double currentDouble;
            while (doubleScanner.hasNextDouble()) {
                currentDouble = doubleScanner.nextDouble();
                if (currentDouble > bigDouble) {
                    bigDouble = currentDouble; 
                }
                if (currentDouble < smallDouble) {
                    smallDouble = currentDouble; 
                }
            }
            System.out.println("The largest number is " + bigDouble); 
            System.out.println("the smallest number is " + smallDouble);
        } catch (Exception l) {
            System.err.println(l.getMessage());
        }
    }
}

