package rps_game;

public class CallingRPSGame {

    public static void main(String[] args) {


        GameRPS GameRPS= new GameRPS();

        GameRPS.choiceOfWeapon();
        String choice;
        do {
            System.out.print("computer :\n");
            GameRPS.setcomputer(GameRPS.scanner.nextLine().toLowerCase());

            System.out.print("computer2 :\n");
            GameRPS.setcomputer2(GameRPS.scanner.nextLine().toLowerCase());

            GameRPS.getWhoWon(GameRPS.getcomputer(), GameRPS.getcomputer2());

            System.out.println("Do you want play again?\n"
                    + "If you want enter \" Y \" or \" N \"");

            choice=GameRPS.scanner.nextLine().toLowerCase();
        }while (choice.equals("y"));





    }
}
