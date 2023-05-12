package concepts;

import java.util.List;

public class Address {
    private String street;
    private String zipcode;
    private List<String> phones;
    public Address(String street,String zipcode,List<String>phones){
        this.street=street;
        this.zipcode=zipcode;
        this.phones=phones;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
