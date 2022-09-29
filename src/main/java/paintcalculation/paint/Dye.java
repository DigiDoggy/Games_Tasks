package paintcalculation.paint;

abstract class Dye {

   protected int ral;
   protected static int gruntThickness;
   protected static int finishThickness;


   public Dye(int gruntThickness) {
      this.gruntThickness=gruntThickness;
   }

   public Dye(int finishThickness, int ral){
      this.finishThickness=finishThickness;
      this.ral=ral;
   }


   //   protected int[] wetFilmThickness;
//   protected float[] theoreticalSpreadingRate;

//   protected String typeOfPain;  // Alkid, epoksid, polyurethane
//   protected String stage;



   public abstract void printDyeInfo();


}
