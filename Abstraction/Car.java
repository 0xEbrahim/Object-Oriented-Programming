public abstract class Car {
    private float height;
    private float weight;
    private int numberOfWheels;
    Car(){}
    Car(float height , float weight , int numberOfWheels){
        this.height = height;
        this.weight = weight;
        this.numberOfWheels = numberOfWheels;
    }
    abstract void autoPilot();
    abstract void streamingServices();
    abstract void parkingSensors();

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
