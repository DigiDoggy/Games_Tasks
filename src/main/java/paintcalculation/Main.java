package paintcalculation;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //questionnaire
        getCompanyName();
        getColor();
        getFinishThicknessFromClient();
        getGruntThicknessFromClient();
        getMetalAreaFromClient();

        // checking
        ClientPath.clientCheckInfo();

        // Full information
        Operation.getProjectIfo();
        //file creation
        CreatingProjectFile.creating();

    }

    public static void getColor() {
        System.out.println("Enter finish color: ");
        ClientPath.setFinishColor(scanner.nextLine());
    }

    public static void getCompanyName() {
        System.out.println("Enter your company name: ");
        ClientPath.setCompanyName(scanner.nextLine().toLowerCase());
    }

    public static void getGruntThicknessFromClient() {
        System.out.println("Enter soil thickness (40,50,60): ");

        ClientPath.setGruntThickness(Operation.getInt());
        if (ClientPath.getGruntThickness() != 40 &&
                ClientPath.getGruntThickness() != 50 &&
                ClientPath.getGruntThickness() != 60) {
            while (ClientPath.getGruntThickness() != 40 &&
                    ClientPath.getGruntThickness() != 50 &&
                    ClientPath.getGruntThickness() != 60)
            {
                System.out.println("Wrong input, enter soil thickness (40,50,60):");
                ClientPath.setGruntThickness(Operation.getInt());
            }
        }
    }

    public static void getFinishThicknessFromClient() {
        System.out.println("Enter finish thickness (50,80):");
        ClientPath.setFinishThickness(Operation.getInt());
        if (ClientPath.getFinishThickness() != 50 &&
                ClientPath.getFinishThickness() != 80) {
            while (ClientPath.getFinishThickness() != 50 &&
                    ClientPath.getFinishThickness() != 80) {
                System.out.println("Wrong input, enter finish thickness (50,80): ");
                ClientPath.setFinishThickness(Operation.getInt());
            }
        }

    }

    public static void getMetalAreaFromClient() {
        System.out.println("Enter area(m^2) of metal: ");
        ClientPath.setMetalArea(Operation.getFloat());
    }

}