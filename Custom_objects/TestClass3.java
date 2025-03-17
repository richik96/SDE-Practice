package Custom_objects;

import java.util.*;
import java.util.stream.Collectors;

public class TestClass3 {

    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee(101, 70000, "IT", 28),
                                        (new Employee(103, 65000, "IT", 27)),
                                        (new Employee(105, 60000, "HR", 26)),
                                        (new Employee(100, 75000, "HR", 29)));

        Map<String, Double> res = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Optional<Employee> sal = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(2).findFirst();

        emp.stream().sorted((a, b) -> b.getAge()-a.getAge())
                .skip(1)
                .map(Employee::getAge)
                .toList().forEach(System.out::println);

        Map<Integer, Optional<Double>> minSal = emp.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.mapping(
                Employee::getSalary, Collectors.minBy(Comparator.naturalOrder())
            )));

        Map<String, Optional<Double>> dept = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(
                        Collectors.mapping(Employee::getSalary, Collectors.toCollection(TreeSet::new)),
                        salaries -> {
                            if(salaries.size() < 2) return Optional.empty();
                            Iterator<Double> it = salaries.descendingIterator();
                            it.next();
                            return (Optional.of(it.next()));
                        }
                )));
        emp.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println("Average for each department : "+res);
        System.out.println("3rd highest salary : "+sal.get());
        System.out.println("2nd highest from each department : "+dept);
        System.out.println("Custom_objects.Employee with minimum salary : "+minSal);
    }
}
