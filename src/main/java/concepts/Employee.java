package concepts;

public class Employee {
    public static void main(String[] args) {
        String str  = "abc";
        String [] strs = str.split("");
        System.out.println(strs);
    }
    String name;
    Address address;

    public Employee(String name,Address add){
        this.name=name;
        this.address=add;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
