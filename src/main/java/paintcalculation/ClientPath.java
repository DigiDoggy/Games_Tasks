package paintcalculation;

import java.util.Scanner;

public class ClientPath {


    public static Scanner scanner = new Scanner(System.in);
    private static String companyName;
    private static String finishColor;
    private static int gruntThickness;
    private static int finishThickness;
    private static float metalArea;


//    public ClientPath(String companyName, float metalArea, int gruntThickness, int finishThickness, String finishColor){
//
//    }
   // Getter and Setters

    public static void setCompanyName(String companyName) {
        ClientPath.companyName = companyName;
    }

    public static  String getCompanyName() {
        return companyName;
    }

    public static String getFinishColor() {
        return finishColor;
    }

    public static void setFinishColor(String finishColor) {
        ClientPath.finishColor = finishColor;
    }

    public static int getGruntThickness() {
        return gruntThickness;
    }

    public static void setGruntThickness(int gruntThickness) {
        ClientPath.gruntThickness = gruntThickness;
    }

    public static int getFinishThickness() {
        return finishThickness;
    }

    public static void setFinishThickness(int finishThickness) {
        ClientPath.finishThickness = finishThickness;
    }

    public static float getMetalArea() {
        return metalArea;
    }

    public static void clientCheckInfo() {
        char customerAnswer;
        do {
            getCustomerInfo();
            System.out.print("If you want to fix something, press \"y\", if not \"n\"." + "\n");
            customerAnswer = scanner.next().toLowerCase().charAt(0);
            if (customerAnswer==('y')) {
                Main.getCompanyName();
                Main.getColor();
                Main.getFinishThicknessFromClient();
                Main.getGruntThicknessFromClient();
                Main.getMetalAreaFromClient();
            }

        } while (customerAnswer == 'y');
    }

    public static void setMetalArea(float metalArea) {
        ClientPath.metalArea = metalArea;
    }

    public static void getCustomerInfo(){
        System.out.println("\t Your profile is:");
        System.out.println("Company name: " + companyName);
        System.out.println("Soil thickness is: " + gruntThickness);
        System.out.println("Finish thickness is: " + finishThickness);
        System.out.println("Finish color is: " + finishColor);
        System.out.println("Metal area is: " + metalArea);

        System.out.println();

    }
}



