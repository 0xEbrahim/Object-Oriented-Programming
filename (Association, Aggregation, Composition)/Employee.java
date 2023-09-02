public class Employee {
  private int id ;
  private float salary ;
  private PersonalInfo personalInformation ;
  private Department dept ;
  public Employee(){}

  public Employee(int id, float salary,String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth, Department dept) {
    this.id = id;
    this.salary = salary;
    this.personalInformation = new PersonalInfo(firstName,middleName,lastName,bloodGroup,accountNumber,nationality,yearOfBirth);
    this.dept = dept;
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public PersonalInfo getPersonalInformation() {
    return personalInformation;
  }

  public Department getDept() {
    return dept;
  }

  public void setDept(Department dept) {
    this.dept = dept;
  }

  public void setPersonalInformation(PersonalInfo personalInformation) {
    this.personalInformation = personalInformation;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", salary=" + salary +
            ", personalInformation=" + personalInformation +
            ", dept=" + dept +
            '}';
  }
}
