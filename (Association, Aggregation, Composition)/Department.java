public class Department {
    private int deptNom;
    private String deptName;

    public Department(){}

    public Department(int deptNom, String deptName) {
        this.deptNom = deptNom;
        this.deptName = deptName;
    }

    public int getDeptNom() {
        return deptNom;
    }

    public void setDeptNom(int deptNom) {
        this.deptNom = deptNom;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptNom=" + deptNom +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
