
abstract class CheckPoint {
   String Id;
   String name;


   Double distancefromprevious;
   Double ExpectedTime;
   Double actualTime;


   public CheckPoint(String id ,String name,double distancefromprevious,double ExpectedTime, double actualTime ){
       this.Id=id;
       this.name=name;
       this.distancefromprevious=distancefromprevious;
       this.ExpectedTime=ExpectedTime;
       this.actualTime=actualTime;

   }
   abstract double computePenalty();
}
