package paintcalculation.data;

public class DyeData {
    protected static final int[] dryGrunt = new int[]{40,50,60};
    protected static float[] epoSpreadingRate= new float[]{12.5f,10.2f,8.5f};
    protected static int[] dryFinish = new int[]{50,80};
    public static final float lossFactor= 0.15f;
    protected static final float[] polySpreadingRate = new float[]{13f,6.3f};


    //Getters and setters
    public static int[] getDryGrunt() {
        return dryGrunt;
    }

    public static float[] getEpoSpreadingRate() {
        return epoSpreadingRate;
    }

    public static int[] getDryFinish() {
        return dryFinish;
    }

    public static float[] getPolySpreadingRate() {
        return polySpreadingRate;
    }

}
