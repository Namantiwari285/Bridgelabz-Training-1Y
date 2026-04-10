public class FuelCheckpoint extends CheckPoint {
    public FuelCheckpoint(String id,String name,double distance,double expected,double actual){
        super (id,name,distance,expected,actual);

    }
}
@Override
double computePenalty(){
    if(actualTime>ExpectedTime){
        return 10;
    }
    return 0;
}
}