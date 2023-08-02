import java.awt.*;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius , String color){
        this.color = color;
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setRaduis(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRaduis() {
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Radius : " + getRaduis() + "\n" + "Color : " + getColor() + "\n" + "Area : " + getArea() + "\n" + "Circumference : " + getCircumference() + "\n";
    }
}
