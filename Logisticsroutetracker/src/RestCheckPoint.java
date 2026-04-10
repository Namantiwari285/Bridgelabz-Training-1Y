public class RestCheckPoint extends CheckPoint {
    public RestCheckPoint (String id,String name,double distance,double expected,double actual) {
        super(id, name, distance, expected, actual);
    }
    @Override
    double computePenalty(){
        if(actualTime-ExpectedTime>30){
            return (actualTime-ExpectedTime)*0.5;
        }
        return 0;
    }
}