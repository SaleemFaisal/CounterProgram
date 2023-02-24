package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Text is a base class or superclass
public class Text {

    public String text;

    //Constructor
    public Text() {

    }

    //Method to get text from the user 
    public String getText() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or text: ");
        text = input.nextLine();
        System.out.println("-----------------------");
        return text;
    }

    //Method to read srting from file 
    public String readFile() {
        boolean foundFile = false;
        //While loop if the file is not found it make the user re-enter the file name
        while (!foundFile) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the file name with extension: ");
                text = input.nextLine();
                Scanner fileScanner = new Scanner(new File(text));
                text = fileScanner.nextLine();
                System.out.println("The file countent: " + text);
                foundFile = true;
            } catch (FileNotFoundException e) {
                System.out.println("File does not exist please try again. ");
            }
            System.out.println("-----------------------");
        }
        return text;

    }

}
