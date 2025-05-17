package Custom_objects;

import java.util.*;
import java.util.stream.Collectors;

public class TestClass3 {

    public static void main(String[] args) {
        List<Employee> emp = List.of(new Employee(101, 25, 70000, "IT"),
                (new Employee(103, 27,65000, "IT")),
                (new Employee(105, 32,60000, "HR")),
                (new Employee(100, 29,75000, "HR")),
                (new Employee(102, 30, 60000,"IT")));

        Map<String, Double> res = emp.stream().collect(Collectors.groupingBy(Employee::department, Collectors.averagingDouble(Employee::salary)));

        Optional<Employee> sal = emp.stream().sorted(Comparator.comparing(Employee::salary)).skip(2).findFirst();

        emp.stream()
                .sorted((a, b) -> b.age()-a.age())
                .skip(1)
                .map(Employee::age)
                .toList().forEach(System.out::println);

        Map<Integer, Optional<Double>> minSal = emp.stream().collect(Collectors.groupingBy(Employee::age, Collectors.mapping(
                Employee::salary, Collectors.minBy(Comparator.naturalOrder())
            )));

        Map<String, Optional<Double>> dept = emp.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.collectingAndThen(
                        Collectors.mapping(Employee::salary,
                                Collectors.toCollection(TreeSet::new)
                        ),
                        salaries -> {
                            if(salaries.size() < 2)
                                return Optional.empty();
                            Iterator<Double> it = salaries
                                    .descendingIterator();
                            it.next();
                            return (Optional.of(it.next()));
                        }
                )));
        emp.stream().map(Employee::department).distinct().forEach(System.out::println);

        System.out.println("Average for each department : "+res);
        System.out.println("3rd highest salary : "+sal.get());
        System.out.println("2nd highest from each department : "+dept);
        System.out.println("Custom_objects.Employee with minimum salary : ");
        minSal.forEach((a, b) -> System.out.println(a+" : "+b.get().doubleValue()));
    }
}
