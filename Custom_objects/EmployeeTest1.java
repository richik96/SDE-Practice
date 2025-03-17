package Custom_objects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest1 {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(new Employee(101, 70000, "IT", 28),
                (new Employee(103, 65000, "IT", 27)),
                (new Employee(105, 60000, "HR", 26)),
                (new Employee(100, 75000, "HR", 29)),
                (new Employee(102,60000,"IT",31)));

        //sort employees by their salary in descending order. if salary is same sort by department.
        emp.stream().sorted(Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getDepartment).reversed())
                .forEach(System.out::println);

        //using custom comparator

        Comparator<Employee> customComparator = (e1, e2) -> {
            int salaryComparison = Double.compare(e2.getSalary(), e1.getSalary());
            if(salaryComparison != 0) {
                return salaryComparison;
            }
            else {
                return e1.getDepartment().compareTo(e2.getDepartment());
            }
        };

        System.out.println("with custom comparator :\t");
        emp.stream().sorted(customComparator)
                .forEach(System.out::println);
    }
}
