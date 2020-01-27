package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//1 TODO: HashMap
        /**    Prompt: Enter a number: 10 Response: You entered ten.
         If number is not found (use myMap.containsKey(10) then prompt user to tell the map to add that to the map.
         Add the key and value to the map with the following line of code:
         */
/*
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(4, "Four");
        myMap.put(5, "Five");
        myMap.put(6, "Six");
        myMap.remove(100);
        char wantToContinue = 'Y';
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
            wantToContinue = sc.next().charAt(0);
        } while (wantToContinue == 'Y');

        try {

            FileWriter writer = new FileWriter("WriteAFile.txt");

            for (int key : myMap.keySet()) {
                writer.write(key + " " + myMap.get(key) + "\n");
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {


            File file = new File("C:\\Users\\Administrator\\IdeaProjects\\SetAndMap\\ReadFromFile.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            System.out.println("File Contents");
            while ((st = br.readLine()) != null) {
                String[] firstLine = st.split(" ");
                System.out.println("key : " + firstLine[0] + " value : " + firstLine[1]);
                myMap.put(Integer.parseInt(firstLine[0]), firstLine[1]);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("All Contents will be Written to the file :" + myMap);
        try {

            FileWriter writer = new FileWriter("WriteAFile.txt");

            for (int key : myMap.keySet()) {
                writer.write(key + " " + myMap.get(key) + "\n");
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("You can find all the lists in a file, WriteAfile.txt");*/

//2 TODO: Zork 1
        //3 TODO: Zork Extension 50
        //4 TODO: Group Eliza 0
        //5 TODO: Simple Eliza Application  25
        //6 TODO: Full Eliza Application 50
        //7 TODO: Add Easter Eggs to Eliza 50
        //8 TODO: Pair Of Number 5
        //9 TODO: Method Exercises 40

        //TODO: only testing purpose

    }

}

