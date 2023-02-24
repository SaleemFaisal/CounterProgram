package Project;

import java.util.HashMap;

// Counter is derived class or supclass from Text class
public class Counter extends Text {

    private int countLetter = 0;
    private int countWord;
    private final HashMap<Character, Integer> list = new HashMap<>();

    //Constructor
    public Counter() {

    }

    //Mehtod to count Letters only 
    public int getCount() {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                countLetter++;
            }
        }
        System.out.println("Number of letters: " + countLetter);
        System.out.println("-----------------------");
        return countLetter;
    }

    //Method to count the punctuation marks and digits 
    public int getCountOfPuncDigit() {
        int puncCount = text.replaceAll("[^\\p{Punct}]", "").length();
        int digitCount = text.replaceAll("[^\\d]", "").length();
        int sum = countLetter + puncCount + digitCount;

        System.out.println("Number of Punctuation marks: " + puncCount + "\nNumber of Digit: " + digitCount);
        System.out.println("-----------------------");
        System.out.println("Number of count Letters and Punctuation marks and Digit: " + sum);
        System.out.println("-----------------------");
        return puncCount;
    }

    //Method to count words
    public int getWordCount() {
        String[] words = text.split(" ");
        countWord = words.length;
        System.out.println("Number of words: " + countWord);
        System.out.println("-----------------------");
        return countWord;
    }

    //Method that use HashMap to count the letters that appear in the text 
    //and print it all even if thy were not used
    public void printAllLetters() {

        for (int i = 0; i < text.length(); i++) {
            String s = text.toUpperCase();
            char c = s.charAt(i);
            if (list.containsKey(c)) {
                list.put(c, list.get(c) + 1);
            } else {
                list.put(c, 1);
            }
        }

        // Print all the letters, even if they were not used 
        System.out.println("List of all letters and the number of apperances in the text");
        for (char c = 'A'; c <= 'Z'; c++) {
            if (list.containsKey(c)) {
                System.out.println(c + ": " + list.get(c));
            } else {
                System.out.println(c + ": 0");
            }
        }
        System.out.println("-----------------------");
    }
}
