package concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectREplacement {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        phones.add("1243");
        phones.add("23232");
        Address address = new Address("park street", "560075", phones);
        Map<String,Employee>map=new HashMap<>();

        Employee durgaEmp = new Employee("durgadas",address);
        map.put("durga",durgaEmp);
        durgaEmp.address=new Address("wild street", "422003", phones);
        Employee empp = map.get("durga");
        System.out.println(empp.getName());
    }
}
