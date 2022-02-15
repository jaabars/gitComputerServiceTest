package kg.itschool.computerservice.models.entities;


import kg.itschool.computerservice.models.enums.ProductType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "product")
public class Product {

    @Id
    String model;

    String maker;

    @Enumerated(value = EnumType.STRING)
    ProductType type;
}
