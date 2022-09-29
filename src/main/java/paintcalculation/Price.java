package paintcalculation;

public class Price {
    private static final float priceOfGrunt = 60;
    private static final float pricePfFinish = 70;

    //Getter

    public static float getProjectGruntPrice(){
        return Operation.roundDecimalPoint(priceOfGrunt * AmountOfGrunt.getBucketGrunt());
    }
    public static float getProjectFinishPrice(){
        return Operation.roundDecimalPoint(pricePfFinish * AmountOfFinish.getBucketFinish());
    }

    public static void getPriceInfo(){
        System.out.println("How much will it cost to buy soil: " + getProjectGruntPrice());
        System.out.println("How much will it cost to buy finish: " + getProjectFinishPrice());
    }
}
