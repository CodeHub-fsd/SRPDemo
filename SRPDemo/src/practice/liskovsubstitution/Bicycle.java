package practice.liskovsubstitution;

public class Bicycle extends Vehicle{
    public static int COST_PER_TIRE=50;
    public int getNoOfWheels(){
        return 4;
    }
    public int tireCost(Vehicle vehicle){
        return COST_PER_TIRE*vehicle.getNumberOfWheels();
    }
    public static void main(String[] args){
        Bicycle bi=new Bicycle();
       int result=  bi.tireCost(bi);
        System.out.println(result);
    }
}
