package paintcalculation;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static freehw.paintcalculation.ClientPath.scanner;
import static freehw.paintcalculation.Price.getPriceInfo;

public class Operation {

    //Floor rounding,to calculate the remaining paint
    public static float round(float number){
        return (float) Math.floor(number);
    }

    //Rounding after decimal point
    public static float roundDecimalPoint(float result){
        BigDecimal rounding = new BigDecimal(Double.toString(result));
        rounding = rounding.setScale(2, RoundingMode.HALF_UP);
        return (float) rounding.doubleValue();
    }

    //Checking a number for input type float
    public static float getFloat() {
        do {
            if (scanner.hasNextFloat()) {
                return scanner.nextFloat();
            } else {
                System.out.println("Enter the numbers: ");
                scanner.nextLine();
            }
        } while (!scanner.hasNextFloat());

        return getFloat();     // What is that Oo
    }

    // Checking a number for input type int
    public static int getInt() {
        do {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Enter the numbers: ");
                scanner.nextLine();
            }
        } while (!scanner.hasNextInt());

        return getInt();   // What is that Oo
    }

    // Get info About painting
    public static void getProjectIfo(){
        ClientPath.getCustomerInfo();
        AmountOfGrunt.getGruntInfo();
        AmountOfFinish.getFinishIfo();
        getPriceInfo();
    }

    // Regex for search finish or grunt Storage in file

/*   public static void getPaintInStorage(){
       try(FileReader reader = new FileReader("PaintProg\\Storage\\GruntStorage.txt"))
       {
           char[] buf = new char[256];
           int c;
           while((c = reader.read(buf))>0){

               if(c < 256){
                   buf = Arrays.copyOf(buf, c);
               }
               System.out.print(buf);
           }
       }
   }*/

}
