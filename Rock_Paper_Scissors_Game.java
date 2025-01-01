package java_projects;

import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to our rock,paper,scissor game\n" + "Enter 1 for rock \n" + "Enter 2 for paper\n" + "Enter 3 for scissor");
        Scanner sc = new Scanner(System.in);
        int UserInput = sc.nextInt();
        Random var = new Random();
        int ComputerInput = var.nextInt(1, 3);

        switch (UserInput) {
            case 1 -> System.out.println("you choose rock");
            case 2 -> System.out.println("you choose paper");
            case 3 -> System.out.println("you choose scissor");
            default -> System.out.println("please choose valid input");
        }
        if (UserInput <= 3) {
            switch (ComputerInput) {
                case 1 -> System.out.println("computer choose rock");
                case 2 -> System.out.println("computer choose paper");
                case 3 -> System.out.println("computer choose scissor");

            }
        } else {
            System.out.println(" ");
        }
        if (UserInput == 1 && ComputerInput == 2) {
            System.out.println("computer won!");
        } else if (UserInput == 2 && ComputerInput == 3) {
            System.out.println("computer won!");
        } else if (UserInput == 3 && ComputerInput == 1) {
            System.out.println("computer won!");
        } else if (UserInput > 3) {
            System.out.println("it is an invalid input game cannot be processed further");
        } else if (UserInput == ComputerInput) {
            System.out.println("match draw");
        }else{
            System.out.println("congrats you win the match");
        }

        }
    }

