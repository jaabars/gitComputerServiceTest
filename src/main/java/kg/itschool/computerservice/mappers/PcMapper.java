package kg.itschool.computerservice.mappers;


import kg.itschool.computerservice.models.dto.Pc1ExDTO;
import kg.itschool.computerservice.models.entities.Pc;
import org.springframework.stereotype.Component;

@Component
public class PcMapper {

    public Pc1ExDTO pcToPc1ExDTO(Pc pc){
        Pc1ExDTO pc1ExDTO = new Pc1ExDTO();
        pc1ExDTO.setSpeed(pc.getSpeed());
        pc1ExDTO.setHd(pc.getHd());
        pc1ExDTO.setModel(pc.getModel().getModel());
        return pc1ExDTO;
    }
}
