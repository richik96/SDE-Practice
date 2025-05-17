package Custom_objects;

import java.util.*;
import java.util.stream.Collectors;

public class HappiestMind1 {

    public static void main(String[] args) {

        List<Employee> em = Arrays.asList(new Employee(101, 25, 70000, "IT"),
                (new Employee(103, 27,65000, "IT")),
                (new Employee(105, 32,60000, "HR")),
                (new Employee(100, 29,75000, "HR")),
                (new Employee(102, 30, 60000,"IT")));

        em.stream()
                .collect(Collectors.groupingBy(Employee::department,
                    Collectors.collectingAndThen(
                            Collectors.maxBy(Comparator.comparing(Employee::salary)),
                            Optional::get)
                    ))
                .forEach((a,b) -> System.out.println(a + " : "+b.salary()));
    }
}
