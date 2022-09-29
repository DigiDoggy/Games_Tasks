package paintcalculation.data;

import java.util.ArrayList;

public class Storage {
    public static ArrayList<Float> gruntStorage=new ArrayList<>();

    public static ArrayList<Float> finishStorage=new ArrayList<>();

// Grunt Methods
    public static void addToGruntStorage(float value){
     gruntStorage.add(value);
    }

    public static void showGruntStorage(){
        System.out.println(gruntStorage);
    }

    public static ArrayList<Float> getGruntStorage() {
        return gruntStorage;
    }

// Finish Methods

    public static void addFinishStorage(float value){
        finishStorage.add(value);
    }

    public static void showFinishStorage(){
        System.out.println(finishStorage);
    }

    public static ArrayList<Float> getFinishStorage() {
        return finishStorage;
    }

  /*  public static float getElementFromStorage(ArrayList<Float> arrayList){
        float value = 0;
        for (float num:arrayList) {
            System.out.println(num);
            num=value;
        }
        return  value;


    }*/
}
