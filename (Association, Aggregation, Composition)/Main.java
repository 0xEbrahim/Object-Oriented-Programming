public class Main {
    public static void main(String[] args) {
        Department dept = new Department(212,"SW");
        Employee emp = new Employee(114,3400.0f,"Ebrahim","Elsayed","Ebarhim","O+","14775","Egyptian",2003, dept);
        System.out.println(emp);
        
    }
}