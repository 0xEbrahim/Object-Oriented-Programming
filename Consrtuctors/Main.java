import java.util.*;

class Program
{
    public static void main(String []args)
    {
    String name , description , color;
    int quantity;
    float discount , price;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Name");
    name = sc.nextLine();
        System.out.println("Enter Product Description");
    description = sc.nextLine();
        System.out.println("Enter Product Color");
    color = sc.nextLine();
        System.out.println("Enter Product Quantity");
    quantity = sc.nextInt();
        System.out.println("Enter Product Discount");
    discount = sc.nextFloat();
        System.out.println("Enter Product Price");
    price = sc.nextFloat();
    Product p1 = new Product(name ,description , price , discount ,quantity , color);
    p1.display();
    }
}