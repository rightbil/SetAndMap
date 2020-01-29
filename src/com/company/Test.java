package com.company;

import java.util.*;
import java.util.Scanner;

public class Test {
    public static final String vowelPostFix = "ay";
    public static void WriteToScreen(String args) {
        System.out.println(args);
    }
    public static String consonantRandomPostFix() {
        return new Random().nextInt(2) == 1 ? consonantPostFix.tay.toString() : consonantPostFix.way.toString();
    }
    public static boolean isVowel(char c) {
// TODO: which one is efficent
        ArrayList<Character> d = new ArrayList<>();
        Collections.addAll(d, 'a', 'e', 'i', 'o', 'u');
        /*
        boolean isvowel= false;
        char[] v = {'a', 'e', 'i', 'o', 'u'};
        for (int i=0; i<v.length; i++) {
            if(v[i]==c)
                isvowel= true;
        }
        return isvowel;
        */
        return d.contains(c);
    }

    public static String lookupMap(String word) {
        String correspondnceValue = null;
        HashMap<String, String> map = new HashMap<>();
        map.put("i", "you");
        map.put("me", "you");
        map.put("my", "you");
        map.put("am", "are");

        for (String key : map.keySet()) {
            if (word.equalsIgnoreCase(key)) {
                correspondnceValue = map.get(key);
                break;
            }
        }
        return correspondnceValue;
    }

    public static String randomPrefix() {
        ArrayList<String> a = new ArrayList<>(
                Arrays.asList(
                        "Why do you say that ",
                        "You seem to think that ",
                        "So, you are concerned that "));
        Random r = new Random();
        return a.get(r.nextInt(a.size()));
    }

    public static String[] capitalizeAll(String[] args) {
        String[] capWords = null;
        for (int i = 0; i < args.length; i++) {

            capWords[i] = args[i].toUpperCase();

        }
        return capWords;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //8 TODO: Add Easter Eggs to Eliza 50
        String[] finalResult;
        String quit = "C";
        String response; // 81 is Q and 113 is q
        String currentValue = null;
        String[] temp;
        StringBuilder sb = new StringBuilder();

        while (!quit.equalsIgnoreCase("Q")) {
            System.out.println("\n\tEnter your response here or Q to quit:");
            response = sc.nextLine();
            if (!response.equalsIgnoreCase("Q")) {
                 temp = response.split(" ");
                 // TODO: The pig case
                if (temp[0].equalsIgnoreCase("pig")) {
                    for (int i = 1; i < temp.length; i++) {
                        if (!lookupMap(temp[i]).isEmpty()) {
                            temp[i] = lookupMap(temp[i]);
                            if (isVowel(temp[i].charAt(i)) == true) {
                                temp[i] += vowelPostFix;
                                WriteToScreen(vowelPostFix + temp[i]);
                            } else {
                                temp[i] += consonantRandomPostFix();
                                sb.append(randomPrefix()).append(temp.toString());
                                WriteToScreen("sb :" + sb);
                            }// end of else
                        }// end of if
                    }//end of for loop
                } // TODO: The CAPs case
                else if (temp[0].equalsIgnoreCase("caps")) {
                    for (int i = 1; i < temp.length; i++) {
                        if (!lookupMap(temp[i]).isEmpty()) {
                            temp[i] = lookupMap(temp[i]);
                            break; //??
                        }
                    }
                    //temp = capitalizeAll(temp);
                    sb.append(randomPrefix()).append(capitalizeAll(temp).toString());
                    WriteToScreen("sb :" + sb);
                } else if (temp[0].equalsIgnoreCase("playgame")) {
                    sb.append("Game 1 \n Game 2 \n Game 3");// show games from enum list
                } else {
                    WriteToScreen("Un classified input change this back to regular asking ");
                }
            }// end of if
            else {
                quit = response;
                break;
            }// End of else
        }
        //WriteToScreen("sb :" + sb);
    }// end of main

    public enum consonantPostFix {way, tay;}

}

