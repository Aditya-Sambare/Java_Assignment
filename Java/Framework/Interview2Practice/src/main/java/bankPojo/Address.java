package bankPojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int addressid;
    int houseno;
    String area;
    String city;
    String state;

    public Address(int houseNotemporary, String areaTemporary) {
    }

    public Address(int houseno, String area, String city, String state) {
        this.houseno = houseno;
        this.area = area;
        this.city = city;
        this.state = state;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public int getHouseno() {
        return houseno;
    }

    public void setHouseno(int houseno) {
        this.houseno = houseno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressid=" + addressid +
                ", houseno=" + houseno +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
