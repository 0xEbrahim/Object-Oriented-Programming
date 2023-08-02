import java.util.*;

class Program
{
    public static void main(String []args)
    {
        System.out.println("------------- Car -----------------");
        Car BMW = new Car(1014120 , 2010 , "BMW" , "Grey");
        System.out.println("Name : " + BMW.getName());
        System.out.println("Color : " + BMW.getColor());
        System.out.println("Year : " + BMW.getYear());
        System.out.println("ID : " + BMW.getId());
        System.out.println("------------------- Setting New Values -----------------");
        BMW.setColor("Black");
        BMW.setId(1470012);
        BMW.setName("Audi");
        BMW.setYear(2005);
        System.out.println("Name : " + BMW.getName());
        System.out.println("Color : " + BMW.getColor());
        System.out.println("Year : " + BMW.getYear());
        System.out.println("ID : " + BMW.getId());
        System.out.println("--------------- Circle -----------------");
        Circle circle1 = new Circle(2 , "Black");
        circle1.setRaduis(3.0);
        circle1.setColor("Red");
        System.out.println("Circle Area : " + circle1.getArea());
        System.out.println(circle1.toString());
        System.out.println("------------- Bank Account ---------------");
        Acount Belal,Mohammed,Ahmed;
        Belal = new Acount();
        Mohammed = new Acount();
        Ahmed = new Acount();
        Belal.insert(9563145, "Belal" , 100);
        Belal.deposit(50);
        Belal.withdraw(140);
        Belal.checkBalance();
       System.out.println(Belal.toString());
        Mohammed.insert(4451238 , "Mohamed" , 10000);
        Mohammed.deposit(12000);
        Mohammed.withdraw(2000);
        Mohammed.checkBalance();
        System.out.println(Mohammed.toString());
        Ahmed.insert(445123887 , "Ahmed" , 500);
        Ahmed.deposit(550);
        Ahmed.withdraw(10);
        Ahmed.checkBalance();
        System.out.println(Ahmed.toString());
    }
}