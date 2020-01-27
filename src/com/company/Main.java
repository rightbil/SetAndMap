package com.company;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//2 TODO: Zork 1
  /**    Prompt: Enter a number: 10 Response: You entered ten.
        If number is not found (use myMap.containsKey(10) then prompt user to tell the map to add that to the map.
        Add the key and value to the map with the following line of code:
   */
        HashMap<Integer, String > myMap= new HashMap<>();
        myMap.put(1,"One");
        myMap.put(2,"Two");
        myMap.put(4,"Four");
        myMap.put(5,"Five");
        myMap.put(6,"Six");
        char wantToContinue='Y';
        do {
            System.out.println("Enter a numeric and see it's value");
            int userInput = sc.nextInt();
            if (myMap.containsKey(userInput)) {
                System.out.println("The value for the key : " + userInput + " is " + myMap.get(userInput));

            } else {
                System.out.println("the key " + userInput + " is not found \nAdd the value to add into the list");
                String value = sc.next();
                myMap.put(userInput, value);

            }
            System.out.println("press Y to continue");
            wantToContinue=sc.next().charAt(0);
        }while(wantToContinue=='Y');

        try {

            FileWriter writer = new FileWriter("WriteAFile.txt");

            for (int key : myMap.keySet()) {
                writer.write(key + " "+ myMap.get(key) + "\n");
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You can find all the lists in a file, WriteAfile.txt");
        //2 TODO: Zork Extension 50
        //1 TODO: Group Eliza 0
        //1 TODO: Simple Eliza Application  25
        //1 TODO: Full Eliza Application 50
        //1 TODO: Add Easter Eggs to Eliza 50
        // ToDO: Pair Of Number 5
        //TODO: Method Exercises 40



    }
}
