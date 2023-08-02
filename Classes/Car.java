class Car {
    private int id , year;
    private String name , color;

    public Car(int id , int year , String name , String color) {
        this.color = color;
        this.id = id;
        this.name = name;
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}