package Custom_objects;

import java.util.*;
import java.util.stream.Collectors;

public class HappiestMind1 {

    public static void main(String[] args) {

        List<Employee> em = Arrays.asList(new Employee(101, 70000, "IT", 28),
                (new Employee(103, 65000, "IT", 27)),
                (new Employee(105, 60000, "HR", 26)),
                (new Employee(100, 75000, "HR", 29)),
                (new Employee(102,60000,"IT",31)));


        em.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                    Collectors.collectingAndThen(
                            Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                            Optional::get)
                    ))
                .forEach((a,b) -> System.out.println(a + " : "+b.getSalary()));
    }
}
