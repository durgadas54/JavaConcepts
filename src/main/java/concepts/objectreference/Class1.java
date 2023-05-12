package concepts.objectreference;

import concepts.Address;
import concepts.Employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Class1 {
    public static void main(String[] args) {
        Map<String, Employee> empMap = new HashMap<>();
        Employee emp= new Employee("class1Emp",
                new Address("lane1","422003", Arrays.asList("abcc","tvd")));
        empMap.put("key1",emp);
            Class2 class2 = new Class2();
            class2.someOperation(empMap.get("key1"));
            System.out.println(empMap.get("key1").getName());
            System.out.println(empMap.get("key1").getAddress().getStreet());

    }
}
