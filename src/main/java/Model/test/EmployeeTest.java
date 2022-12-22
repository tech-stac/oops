package Model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> employee = Arrays.asList(
                new Employee(4, "radha"),
                new Employee(5,"art"),
                new Employee(2, "easdes"),
                new Employee(4, "raadha"),
                new Employee(5,"araaat"),
                new Employee(2, "eaasdes")
        );

         Employee longestEmployee = employee.stream()
                .max(Comparator.comparing(item -> item.getName().length()))
                .get();
        Employee shortestEmployee = employee.stream()
                .min(Comparator.comparing(item -> item.getName().length()))
                .get();
         System.out.println(shortestEmployee.getName() +  "    "   + shortestEmployee.getId());
    }
}
