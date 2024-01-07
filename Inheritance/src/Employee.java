public class Employee {
    private String name;
    private String department;
    private double Salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:- \n" + "Name: " + name + "\nDepartment: " + department + "\nSalary: " + Salary;
    }
}
