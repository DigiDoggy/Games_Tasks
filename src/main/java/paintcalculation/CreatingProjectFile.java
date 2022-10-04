package paintcalculation;


import paintcalculation.data.Storage;

import java.io.File;
import java.io.PrintWriter;

public class CreatingProjectFile {

    public static void creating(){

        try {
            File file = new File("PaintProg\\"+ClientPath.getCompanyName()+".txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.write("Metal area"+ ClientPath.getMetalArea() +  System.lineSeparator());
            pw.write("Grunt thickness: "+ ClientPath.getGruntThickness() +"\t||\t Amount of soil paint for work: "+AmountOfGrunt.getAmountOfDyeGrunt()+ System.lineSeparator());
            pw.write("Finish thickness: "+ ClientPath.getFinishThickness() +"\t||\t Amount of finish paint for work: "+AmountOfFinish.getAmountOfDyeFinish()+ System.lineSeparator());
            pw.write("Finish color: " + ClientPath.getFinishColor() + System.lineSeparator());
            pw.write("---------------------------------------------------------------------------------------------------" + System.lineSeparator());
            pw.write("How many buckets of soil we need: " + AmountOfGrunt.getBucketGrunt() +"\t||\t Price for it: "+Price.getProjectGruntPrice()+ System.lineSeparator());
            pw.write("How many buckets of finish we need: " + AmountOfFinish.getBucketFinish() +"\t||\t Price for it: "+ Price.getProjectFinishPrice()+ System.lineSeparator());
            pw.write("------------------------------/ to the warehouse /------------------------------"+System.lineSeparator());
            pw.write("How many soil liters we has in storage: "+ Storage.getGruntStorage().get(0) + "\t||\t Finish: " + Storage.getFinishStorage().get(0) + System.lineSeparator());
            pw.close();

        }catch (/*IOException*/Exception e ){
            System.out.println("Error: " + e);
        }

    }
}
