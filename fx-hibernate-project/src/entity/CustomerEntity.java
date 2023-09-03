package entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer_info")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CustomerEntity {
    @Id
    @Column(name = "CustID",nullable = false)
    private Integer custid;

    @Column(name = "NIC",nullable = false,length =12)
    private Integer nic;

    @Column(name = "Name",nullable = false)
    private String name;

    @Column(name = "Address",nullable = false)
    private String address;

    @Column(name = "MobileNO",nullable = false,length = 10)
    private int mobileno;

    @OneToMany(mappedBy = "customerEntity", targetEntity = RentEntity.class)
    private List<RentEntity> rentEntityList;
}
