public class Product {
    private String name , description;
    private float price , discount;
    private int quantity;
    private String color;
    public Product(){ // No-Arg
        this.name = "No Name";
        this.description = "No Description";
        this.price = 0.0f;
        this.discount = 0.0f;
        this.quantity = 0;
    }

    public Product(String name , String description , float price , int quantity){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        //System.out.println("Constructor : 4");
    }
    // Parametrize
    public Product(String name, String description, float price, float discount, int quantity) {
      this (name , description , price , quantity);
        this.discount = discount;
        //System.out.println("Constructor : 5");
    }

    public Product(String name , String description , float price , float discount , int quantity , String color){
        this (name , description,price,discount,quantity);
        this.color = color;
        System.out.println("Product added to database");
    }

    public Product(Product obj){ // Copy Constructor
        this (obj.name , obj.description , obj.price,obj.discount, obj.quantity, obj.color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display(){
    System.out.println("Name : " + this.name);
    System.out.println("Description : " + this.description);
    System.out.println("Price : " + this.price);
    System.out.println("Discount : " + this.discount );
    System.out.println("Quantity : " + this.quantity);
    System.out.println("Color : " + this.color);
}

}
