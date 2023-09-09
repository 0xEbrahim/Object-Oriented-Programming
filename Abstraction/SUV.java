public class SUV extends Car{

    SUV(){}
    SUV(float height, float weight, int numberOfWheels) {
        super(height, weight, numberOfWheels);
    }

    @Override
    void autoPilot() {
        System.out.println("SUV AutoPilot");
    }

    @Override
    void streamingServices() {
        System.out.println("SUV Streaming Services");
    }

    @Override
    void parkingSensors() {
        System.out.println("SUV Parking Sensors");

    }


}
