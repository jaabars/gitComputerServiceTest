package kg.itschool.computerservice.services;

import kg.itschool.computerservice.models.dto.Pc1ExDTO;
import kg.itschool.computerservice.models.dto.Pc1ExDTOinterface;
import kg.itschool.computerservice.models.entities.Pc;

import java.util.HashMap;
import java.util.List;

public interface PcService {
    List<Pc> getAllPriceLessThanPrice(Double price);

    List<Pc1ExDTO> getAll(Double price);

    List<Pc1ExDTOinterface> getAllInterface(double price);

    List<HashMap<String, Object>> getHash(Double price);
}
