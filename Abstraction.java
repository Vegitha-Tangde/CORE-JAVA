//import java.util.*;

//Interface - defines method
interface Car {
    void applyBrakes();
    void applyGear();
    void accelerate();

    
}
class CarImpl implements Car{
    //@Override
    public void applyBrakes(){
        System.out.println("Brakes applied");
    }
    //@Override
    public void applyGear(){
        System.out.println("Gear applied");
    }
    //@Override
    public void accelerate(){
        System.out.println("Car is running");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        CarImpl obj = new CarImpl();
        obj.accelerate();
    }
    
}
