package dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {
    private Integer id;
    private String name;
    private String email;
    private Integer mobileno;
    private String username;
    private String password;

    public UserDto() {
    }

    public UserDto(Integer id, String name, String email, Integer mobileno, String username, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileno = mobileno;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobileno() {
        return mobileno;
    }

    public void setMobileno(Integer mobileno) {
        this.mobileno = mobileno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileno=" + mobileno +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
