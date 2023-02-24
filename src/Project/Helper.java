package Project;

import java.util.Scanner;

public class Helper {

    //Mehtod to disply Wellcome message
    public static void wellcomeMessage() {
        System.out.println("Wellcome to the Counter program");
    }

    //Method to enter the text form the user or read it from a file and then disply the menu
    public static void displayAll() {
        Counter text1 = new Counter();
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose if you wnat to enter the text or read it from a file ");
        System.out.println("(1) For enter the text\n(2) For read the text from the file");
        System.out.print("Enter your Choice: ");
        OUT://To break out from the while loop if the user entered valid input
        //While loop if the user entered wrong input it will go back
        while (true) {
            String choice = input.nextLine();
            //Switch case to choose if the user want to enetr the text or read it from a file
            switch (choice) {
                case "1":
                    text1.getText();
                    break OUT;
                case "2":
                    text1.readFile();
                    break OUT;
                default:
                    System.out.println(choice + " Is Invalid input.\nPlease enter (1) or (2)");
                    break;
            }
        }
        System.out.println("Please choose from this menu ");
        System.out.println("(1) for count letters");
        System.out.println("(2) for count words");
        System.out.println("(3) for prnit all used letters");
        System.out.println("(4) for display (1),(2),(3)");
        System.out.print("Enter your Choice: ");

        OUT:// To break out from the while loop if the user entered valid input and Continue for continueOrExit method
        while (true) {
            String userChoice = input.nextLine();
            System.out.println("-----------------------");
            //Switch case to choose from the menu
            switch (userChoice) {

                case "1": //To count letters and punctuation marks and digits
                    text1.getCount();
                    text1.getCountOfPuncDigit();
                    break OUT;

                case "2": //To count words
                    text1.getWordCount();
                    break OUT;

                case "3": //To print all letters and the number of apperances
                    text1.printAllLetters();
                    break OUT;

                case "4"://To count letters and words and print all letters 
                    text1.getCount();
                    text1.getCountOfPuncDigit();
                    text1.getWordCount();
                    text1.printAllLetters();
                    break OUT;

                default: // If the user entered wrong input
                    System.out.println(userChoice + " Is Invalid input.\nPlease enter 1,2,3,4");
                    break;
            }
        }
    }

    //Method that creates loop if the user wnats to continue or exit the program
    public static void continueOrExit() {
        OUT: //To break out of the while loop and exit the program
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to Continue or Exit");
            System.out.println("(C) for Continue");
            System.out.println("(E) for Exit");
            System.out.println("-----------------------");

            System.out.print("Please enter your Choice: ");
            String s = input.nextLine();
            String choice = s.toUpperCase();//If the user entered a Lower case letter it's will convert it to upper case
            switch (choice) {
                case "C": //To Continue and go for displayAll method
                    Helper.displayAll();
                    break;
                case "E": //To exit the program
                    System.out.println("-----------------------");
                    System.out.println("Thank you for using Counter program");
                    break OUT;
                default: //If the user entered wrong input
                    System.out.println(choice + " Is invalid input");
                    break;
            }
        }
    }
}
