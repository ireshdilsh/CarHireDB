package entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "car_category_info")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CarCategoryEntity {
    @Id
    @Column(name = "Category_ID",nullable = false)
    private Integer categoryid;

    @Column(name = "Catogery_Name",nullable = false)
    private String name;

@OneToMany(mappedBy = "carCategoryEntity",targetEntity = CarEntity.class)
    private List<CarEntity>carEntities;
}
