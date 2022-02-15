package kg.itschool.computerservice.models.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
public class Pc1ExDTO {
    String model;
    int speed;
    double hd;

    public Pc1ExDTO(String model, int speed, double hd) {
        this.model = model;
        this.speed = speed;
        this.hd = hd;
    }

}
