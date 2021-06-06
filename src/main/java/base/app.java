package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("What is the quote? ");
        String quote = newScan.nextLine();

        System.out.print("Who said it? ");
        String author = newScan.nextLine();

        //Concat""
        String output = author + " says, \""+quote+"\"";

        //Output
        System.out.println(output);
    }
}
