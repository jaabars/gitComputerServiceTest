package kg.itschool.computerservice.dao;

import kg.itschool.computerservice.models.dto.Pc1ExDTO;
import kg.itschool.computerservice.models.dto.Pc1ExDTOinterface;
import kg.itschool.computerservice.models.entities.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<Pc,Integer> {

    List<Pc> findAllByPriceLessThan(double price);

    @Query("select new kg.itschool.computerservice.models.dto.Pc1ExDTO(p.model.model,p.speed,p.hd) from Pc p where p.price<?1")
    List<Pc1ExDTO> findDto(double price);

    @Query("select p.model.model as model,p.speed as speed,p.hd as hd from Pc p where p.price<?1")
    List<Pc1ExDTOinterface> getAllPriceLessThan(double price);
}
