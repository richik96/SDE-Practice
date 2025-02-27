

public class Employee {

    int id;
    double salary;
    String department;
    int age;

    public Employee(int id, double salary, String department, int age) {
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }
}
