package com.company;

public class CWH_15_ch03_PS {

    public static void main(String[] args) {

        /*
        Problem 1:
        write a java program to convert a string to Lowercase
        */

        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        /*
        problem 2:
        Write a Java program to replace spaces with underscores.
        */

        String text= "To Lower Case";
        text = text.replace(" ","_");
        System.out.println(text);

        /*

        problem 3:
        Write a Java program to fill in a letter template which looks like below:

                    letter = “Dear <|name|>, Thanks a lot”

                    Replace <|name|> with a string (some name)

        */
        String latter = "Dear <|name|>, Thanks a lot";
        latter = latter.replace("<|name|>","Parth");
        System.out.println(latter);


        /*

        problem 4:
        Write a Java program to detect double
        and triple spaces in a string.

        */

        String myString = "This String contains   double and tripple space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        /*
        problem 5:
        Write a program to format the following letter using escape sequence characters.

                    Letter = “Dear Harry, This Java Course is nice. Thanks”
         */
        String mylatter =  "Dear Harry,\n\t This Java Course is nice. \n\t\t\t\tThanks!";
        System.out.println(mylatter);











    }

}
