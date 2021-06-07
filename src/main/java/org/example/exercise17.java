    /*
     *  UCF COP3330 Summer 2021 Assignment 1 Solution
     *  Copyright 2021 Emily Gensch
     */
package org.example;
import java.util.Scanner;

    public class exercise17 {
        public static void main(String[] args) {
            Scanner BAC = new Scanner(System.in);


                System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
                int fm;
                    if (BAC.hasNextInt())
                    {
                        fm = BAC.nextInt();
                    }
                    else
                    {
                        System.out.println("invalid number. try again.");
                        return;
                    }

                System.out.print("How many ounces of alcohol did you have? ");
                double ounces;
                    if (BAC.hasNextDouble())
                    {
                        ounces = BAC.nextDouble();
                    }
                    else
                    {
                        System.out.println("invalid number. try again.");
                        return;
                    }

                System.out.print("What is your weight, in pounds? ");
                double pounds;
                    if (BAC.hasNextDouble())
                    {
                        pounds = BAC.nextDouble();
                    }
                    else
                    {
                        System.out.println("invalid number. try again.");
                        return;
                    }

                System.out.print("How many hours has it been since your last drink? ");
                int hours;
                    if (BAC.hasNextInt())
                    {
                        hours = BAC.nextInt();
                    }
                    else
                    {
                        System.out.println("invalid number. try again.");
                        return;
                    }


            double ratio = (fm == 1) ? 0.73 : 0.66;
            double alcoholContent = (ounces * 5.14 / pounds * ratio) - .015 * hours;

            System.out.printf("\nYour BAC is %f\n", alcoholContent);
            String drive = (alcoholContent <= 0.08) ? "It is legal for you to drive." : "It is not legal for you to drive.";
            System.out.println(drive);
    }
}
