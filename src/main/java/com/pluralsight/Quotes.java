package com.pluralsight;

import java.util.Scanner;

public class Quotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quotes = new String[10];

        quotes[0] = "The unexamined life is not worth living. - Socrates";
        quotes[1] = "We suffer more often in imagination than in reality. - Seneca";
        quotes[2] = "He who has a why to live can bear almost any how. - Nietzsche";
        quotes[3] = "Happiness depends upon ourselves. - Aristotle";
        quotes[4] = "Act only according to maxims you can will as universal law. - Kant";
        quotes[5] = "I think, therefore I am. - Descartes";
        quotes[6] = "The life of man is solitary, poor, nasty, brutish, and short. - Hobbes";
        quotes[7] = "No man's knowledge can go beyond his experience. - Locke";
        quotes[8] = "To be is to be perceived. - Berkeley";
        quotes[9] = "Liberty consists in doing what one desires. - John Stuart Mill";


        System.out.println("Gimme a number 1-10: ");

        try {
            int pick = scanner.nextInt();
            scanner.nextLine();

            if(pick < 1 || pick > 10) {
                System.out.println("Out of bounds. Only 1-10 works.");
            } else {
                System.out.println(quotes[pick -1]);
            }
        } catch (Exception e) {
            System.out.println("Bad input. Ranging numbers from 1-10 only.");
        }



    }
}
