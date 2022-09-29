package paintcalculation.paint;


public class Grunt extends Dye{

    private static final int gruntPaintBucket = 20;

    public Grunt(int gruntThickness) {
        super(gruntThickness);
    }

    public static int getGruntPaintBucket(){
        return gruntPaintBucket;
    }

    @Override
    public void printDyeInfo() {
        System.out.println("Dry film thickness: " + gruntThickness);
    }


}
