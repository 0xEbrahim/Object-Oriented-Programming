public class Student {
    private String name, password;
    private boolean loggedIn ;
    private int no;
    static private int count = 1 ;
    private static String departement = "IT";
    private static int minPasswordLength = 6 ;
    public Student(String name ,String password) {
        this.name = name;
        this.password = password;
        this.no = count;
        count++;
    }
    public static boolean validatePassword(String password){
        return (password.length() >= minPasswordLength);
    }
    public boolean logIn(int enteredNo , String enteredPassword) {
        if(enteredNo == no && enteredPassword.equals(password) ) {
            loggedIn = true;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
