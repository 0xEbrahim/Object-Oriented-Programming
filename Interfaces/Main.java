import java.util.*;

public class Main{

    public static void main(String[] args) {
        CarV1 c1 = new CarV1();

//        if(c1 instanceof Checkable)
//            System.out.println("Permitted");
//        else
//            System.out.println("Not permitted");
        GenericInterface <Car> carV1Obj = new Car();
        Car car = carV1Obj.carModel();
    }
}