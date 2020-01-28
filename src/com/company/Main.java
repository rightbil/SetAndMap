package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Main {

    public void foyer(){


    }
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

        System.out.println("What direction you want to move?");
       //get the input where the user wants to go
       //Show what is in that room and give them what possible direction the can go from there
       //Users can move back and forth
       //You program should allow the user to find the secret room only 25% of the time.
       //However, once they find the secret room they can always find it.
       //When the user exits the house or quits there is a 25% chance they will be followed by a ghost. Let them know when they are being followed.
       //Also let the user know how many rooms they visited after they exit or quit.

        HashMap<String, String >  dir= new HashMap<>();

        dir.put("N2","foyer");
        dir.put("S1","front room");
        dir.put("W3","front room");
        dir.put("E4","front room");
        dir.put("E2","front room");
        //dir.put("N5","foyer");


        HashMap<String,HashMap<Object,String>> room= new HashMap<>();

        //room.put("#1",dir);

        System.out.println(dir);
        System.out.println();



        //3 TODO: Zork Extension 50
        //4 TODO: Group Eliza 0
        //5 TODO: Simple Eliza Application  25
        //6 TODO: Full Eliza Application 50
        //7 TODO: Add Easter Eggs to Eliza 50
        //8 TODO: Pair Of Number 5
        //9 TODO: Method Exercises 40

        //TODO: only testing purpose

 /*  HashMap<String,Integer> oldMap= new HashMap<>();
        oldMap.put("Alex",4000);
        System.out.println("Old Map : " + oldMap);
        HashMap<String,Integer> newMap= new HashMap<>();
        newMap.putAll(oldMap);
        newMap.put("Bililign",null);
        newMap.put("Saron", 600);
        newMap.put(null, null); // what is the importance ??
        newMap.putIfAbsent("Gedion",2000);  // will not add it
        newMap.putIfAbsent("Alex",9000);// will add it
        newMap.computeIfAbsent("Blen",k->1000);
        newMap.computeIfPresent("Saron",(key,value) ->400); // tricky

        BiConsumer<String,Integer> actionToMap= new TestBiConsumer();
        newMap.forEach(actionToMap);
        System.out.println("New Map : " + newMap);*/
//TODO:zork

        /*
package com.CodeSea;

import java.util.*;

public class Main {

    public static StringBuilder defaultString = new StringBuilder("Contents in this castle room : ");

    public static void Print(Object linedata) {
        System.out.println(linedata);

    }

    public static void Foyer() {
        System.out.println(defaultString + " dead scorpion");
        System.out.println("Next possible navigation : " + PossibleDirections("foyer"));
    }

    public static void FrontRoom() {
        System.out.println("Contents in this room : dead scorpion");
        System.out.println("your possible rooms to visit: " + PossibleDirections("foyer"));
    }

    public static String PossibleDirections(String currentRoom) {

        String result = null;
        // set contains possible directions
        Set<String> nextExit = new LinkedHashSet<>();
        nextExit.add("N2");

        // map contains possible directions for each room
        Map<String, Set<String>> rooms = new HashMap<>();
        rooms.put("foyer", nextExit);

        nextExit = new LinkedHashSet<>();
        nextExit.add("S1");
        nextExit.add("W3");
        nextExit.add("E4");

        rooms.put("front room", nextExit);

        for (Map.Entry<String, Set<String>> outer : rooms.entrySet()) {
            if (outer.getKey().equalsIgnoreCase(currentRoom)) {
                result = outer.getValue().toString();
            }

        }

        return result;
    }

    public static Set<String> VisitedRooms(String visited) {

        Set<String> visitedRooms = new HashSet<>();
        visitedRooms.add(visited);

        return visitedRooms;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("What direction you want to move?");
        //get the input where the user wants to go
        //Show what is in that room and give them what possible direction the can go from there
        //Users can move back and forth
        //You program should allow the user to find the secret room only 25% of the time.
        //However, once they find the secret room they can always find it.
        //When the user exits the house or quits there is a 25% chance they will be followed by a ghost. Let them know when they are being followed.
        //Also let the user know how many rooms they visited after they exit or quit.
        Scanner sc = new Scanner(System.in);
        String choise = "foyer";
        char continueVisiting = 'Y';
        while (continueVisiting != 'N') {
            switch (choise) {

                case "N2":
                    Foyer();
                    break;
                case "S1":
                    Print("nothing");
                    break;
                case "W3":
                    break;
                case "E4":
                    break;

                default:
                    Print("Enter what room you want to go from t?");
            }
            Print("Continue Visiting Y/N ?");
            continueVisiting = sc.next().charAt(0);
        }
    }
}
*/

    }


}

