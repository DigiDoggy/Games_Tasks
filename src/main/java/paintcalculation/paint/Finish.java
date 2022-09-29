package paintcalculation.paint;

public class Finish extends Dye{
    private static final int finishPaintBucket = 10;

    public Finish(int finishThickness, int ral){
        super(finishThickness,ral);
    }

    public static int getFinishPaintBucket(){
        return finishPaintBucket;
    }

    @Override
    public void printDyeInfo() {
        System.out.println("Finish ral is: " + ral);
        System.out.println(" Finish thickness: " + finishThickness);
    }
}
