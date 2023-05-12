package concepts.objectreference;

import concepts.Address;
import concepts.Employee;

import java.util.Arrays;

public class Class2 {

    public void someOperation(Employee e ){
        e.setAddress(new Address("lane3","560075", Arrays.asList("123","23423")));

    }
}
