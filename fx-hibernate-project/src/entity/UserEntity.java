package entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_info")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserEntity {
    @Id
    @Column(name = "ID",nullable = false)
    private Integer id;

    @Column(name = "Name",length = 20,nullable = false)
    private String name;

    @Column(name ="Email" ,length = 25,nullable = false)
    private String email;

    @Column(name = "Mobile_NO",length = 10,nullable = false)
    private Integer mobileno;

    @Column(name = "Username",length = 10,nullable = false)
    private String username;

    @Column(name = "password",length = 8,nullable = false)
    private String password;

    public UserEntity() {
    }

    public UserEntity(Integer id, String name, String email, Integer mobileno, String username, String password) {
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
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileno=" + mobileno +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
