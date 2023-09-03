package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Customer {
    @Id
    @Column(name = "username",length = 10)
    private String username;

    @Column(name = "name",length = 20)
    private String name;

    @Column(name = "address",length = 12)
        private String address;
    @Column(name = "province",nullable = false)
    private String province;

    public Customer() {
    }

    public Customer(String username, String name, String address, String province) {
        this.username = username;
        this.name = name;
        this.address = address;
        this.province = province;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
