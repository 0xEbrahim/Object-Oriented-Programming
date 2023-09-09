public class HatchBack extends Car{
    HatchBack(){}
    HatchBack(float height , float weight , int numberOfWheels){
        super(height,weight,numberOfWheels);
    }

    @Override
    void autoPilot() {
        System.out.println("HatchBack AutoPilot");
    }

    @Override
    void streamingServices() {
        System.out.println("HatchBack Streaming Services");
    }

    @Override
    void parkingSensors() {
        System.out.println("HatchBack Parking Sensors");

    }


}
