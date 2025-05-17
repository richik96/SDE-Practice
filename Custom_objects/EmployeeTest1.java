package Custom_objects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest1 {

    public static void main(String[] args) {

        List<Employee> emp = List.of(new Employee(101, 25, 70000, "IT"),
                (new Employee(103, 27,65000, "IT")),
                (new Employee(105, 32,60000, "HR")),
                (new Employee(100, 29,75000, "HR")),
                (new Employee(102, 30, 60000,"IT")));

        //sort employees by their salary in descending order. if salary is same sort by department.
        emp.stream().sorted(Comparator.comparing(Employee::salary)
                .thenComparing(Employee::department).reversed())
                .forEach(System.out::println);

        //using custom comparator

        Comparator<Employee> customComparator = (e1, e2) -> {
            int salaryComparison = Double.compare(e2.salary(), e1.salary());
            if(salaryComparison != 0) {
                return salaryComparison;
            }
            else {
                return e1.department().compareTo(e2.department());
            }
        };

        System.out.println("with custom comparator :\t");
        emp.stream().sorted(customComparator)
                .forEach(System.out::println);

        //increase employee salary by 2000 for employee who are earning <70000

        System.out.println("After increasing the salary :");
        emp.stream().filter(e -> e.salary()<70000)
                .map(e -> e.salary()+2000)
                .toList()
                .forEach(System.out::println);
    }
}
