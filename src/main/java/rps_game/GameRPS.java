package rps_game;

import java.util.Scanner;

public class GameRPS {
    private String computer;
    private String computer2;
    public Scanner scanner = new Scanner(System.in);

    //Setter method
    public void setcomputer(String computer) {
        this.computer = computer;
    }

    public void setcomputer2(String computer2) {
        this.computer2 = computer2;
    }

    //Getter method

    public String getcomputer() {
        return computer;
    }

    public String getcomputer2() {
        return computer2;
    }

    public void choiceOfWeapon() {
        System.out.println("Write your choice from \"Rock\", \"Paper\", \"Scissors\".");
    }

    public void getWhoWon(String computer, String computer2) {


        if (computer.equals("rock") && computer2.equals("rock")) {
            System.out.println("TIE");
        } else if (computer.equals("paper") && computer2.equals("rock")) {
            System.out.println("computer Won!");
        } else if (computer.equals("scissors") && computer2.equals("rock")) {
            System.out.println("computer2 Won!");
        }
        if (computer.equals("paper") && computer2.equals("paper")) {
            System.out.println("TIE");
        } else if (computer.equals("rock") && computer2.equals("paper")) {
            System.out.println("computer2 Won!");
        } else if (computer.equals("rock") && computer2.equals("scissors")) {
            System.out.println("computer2 Won!");
        }

        if (computer.equals("scissors") && computer2.equals("scissors")) {
            System.out.println("TIE");
        } else if (computer.equals("paper") && computer2.equals("scissors")) {
            System.out.println("Player 2 Won!");
        } else if (computer.equals("scissors") && computer2.equals("paper")) {
            System.out.println("computer Won!");
        }

    }
}
