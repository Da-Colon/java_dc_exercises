package com.davidacolon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class DcExerciseTwo {
    public static void printNumbers(){
        System.out.println("PRINT NUMBERS\n");

        int start;
        int end = 10;
        for(start = 0; start <= end; start++)
            System.out.println(start);
    }

    public static void printSquare(int size){
        System.out.println("PRINT SQUARE\n");

        String star = " * ";
        String stars = "";
        int width = size;
        int height = size;

        for(int i = 0; i <= width; i++)
            stars = stars.concat(star);
        for(int i = 0; i <= height; i++)
            System.out.println(stars);
    }

    public static void printBox(int width, int height){
        String blank = "   ".repeat(width);
        String star = "*   ".repeat(width);

        for (int i = 0; i <= height; i++) {
            if(i == 0 || i == height)
                System.out.println(star);
            else
                System.out.println("*" + blank + "*");
        }
    }

    public static void printBanner(String text){
        String star = "*";
        int i = 0;

        while(i < 3){
            if(i == 0 || i == 2)
                System.out.println("*".repeat(text.length() + 4));
            if(i == 1)
                System.out.println("* " + text + " *");
            i++;
        }
    }

    public static void numberFactor(int number){
        int[] container = new int[number];
        int index = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0) {
                container[index] = i;
                index++;
            }
        }
        int[] factors = new int[index];
        for(int i = 0; i <= index - 1; i++)
            factors[i] = container[i];

        System.out.println(Arrays.toString(factors));

    }

    public static void decipherOne(String text, int shiftBy){
        System.out.println("Cipher One:\n");

        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        String cipher = "";
        for(int i = 0; i < text.length(); i++) {
            for(int j = 0; j < alpha.length(); j++){
                if (text.charAt(i) == alpha.charAt(j)){
                    cipher = cipher.concat(Character.toString(alpha.charAt((j + shiftBy) <= alpha.length() ? j + shiftBy : (j + shiftBy) - alpha.length() )));
                }
            }
        }
        System.out.println("Cipher:   " + cipher);
    }

    public static void decipher(String text, int shiftBy){
        System.out.println("\nCipher Two:\n");
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        String cipher = "";
        for(int i = 0; i < text.length(); i++) {
            for(int j = 0; j < alpha.length(); j++){
                if (text.charAt(i) == alpha.charAt(j)){
                    cipher = cipher.concat(Character.toString(alpha.charAt( (j - shiftBy) >= 0 ? j - shiftBy : alpha.length() - (shiftBy - j))));
                }
            }
        }
        System.out.println("Message:   " + cipher);
    }

    public static void leetSpeak(String text){
        text = text.toUpperCase();
        Character[] letters = new Character[]{'A','E','G','I','O','S','T'};
        Character[] leetCode = new Character[]{'4','3','6','1','0','5','7'};
        String newCode = "";
        int index = 0;

        while(index <= text.length() - 1){
            int letterIndex = Arrays.asList(letters).indexOf(text.charAt(index));
            if(Arrays.asList(letters).contains(text.charAt(index)))
                newCode = newCode.concat(Objects.toString(Array.get(leetCode, letterIndex)));
            else
                newCode = newCode.concat(Character.toString(text.charAt(index)));
            index++;
        }
        System.out.println(newCode);
    }

    public static void longVowels(String text){
        Character[] vowels = new Character[]{'A','E','I','O','U','a','e','i','o','u'};
        String result = "";

        for(int i = 0; i < text.length(); i++){
            if(Arrays.asList(vowels).contains(text.charAt(i)) && text.charAt(i) == text.charAt(i + 1)){
                result = result.concat(Character.toString(text.charAt(i)).repeat(5));
                i++;
            }
            else
                result = result.concat(Character.toString(text.charAt(i)));
        }
            System.out.println(result);
    }

    public static void sumNumbers(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println("The Sum of the Array is:    " + sum);
    }

    public static void sumPostiveNumbers(int[] numbers){
        int sum = 0;
        for(int num: numbers){
            if(num > 0)
                sum += num;
        }
        System.out.println("The Sum of the Array is:    " + sum);
    }

    public static void matrixSum(int[][] matrixOne, int[][] matrixTwo){
        Integer[][] newMatrix = new Integer[2][2];
        for(int i = 0; i < matrixOne.length; i++){
            for(int j = 0; j < matrixTwo.length; j++){
                int numSum = matrixOne[i][j] + matrixTwo[i][j];
                newMatrix[i][j] = numSum;
            }
        }
        System.out.println(Arrays.deepToString(newMatrix));
    }
}
