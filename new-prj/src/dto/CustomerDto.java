package dto;

public class CustomerDto {
    private String username;
    private String name;
    private String address;
    private String province;

    public CustomerDto() {
    }

    public CustomerDto(String username, String name, String address, String province) {
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
        return "CustomerDto{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
