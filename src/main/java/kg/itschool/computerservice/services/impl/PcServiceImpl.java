package kg.itschool.computerservice.services.impl;

import kg.itschool.computerservice.dao.PcRepo;
import kg.itschool.computerservice.mappers.PcMapper;
import kg.itschool.computerservice.models.dto.Pc1ExDTO;
import kg.itschool.computerservice.models.dto.Pc1ExDTOinterface;
import kg.itschool.computerservice.models.entities.Pc;
import kg.itschool.computerservice.services.PcService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PcServiceImpl implements PcService {

    private PcRepo pcRepo;
    private PcMapper pcMapper;

    public PcServiceImpl(PcRepo pcRepo, PcMapper pcMapper) {
        this.pcRepo = pcRepo;
        this.pcMapper = pcMapper;
    }

    @Override
    public List<Pc> getAllPriceLessThanPrice(Double price) {
        return pcRepo.findAllByPriceLessThan(price);
    }


    @Override
    public List<Pc1ExDTO> getAll(Double price) {
        /*List<Pc> pcList = pcRepo.findAllByPriceLessThan(price);
        List<ProductEx1Dto> productEx1DtoList = new ArrayList<>();
        for (Pc pc:pcList){
            productEx1DtoList.add(pcMapper.productToProductEx1Dto(pc));
        }
return productEx1DtoList;*/
        return pcRepo.findDto(price);
    }

    @Override
    public List<Pc1ExDTOinterface> getAllInterface(double price) {
        return pcRepo.getAllPriceLessThan(price);
    }

    @Override
    public List<HashMap<String, Object>> getHash(Double price) {
        List<Pc> pcList = getAllPriceLessThanPrice(price);
        List<HashMap<String,Object>> pcHashList = new ArrayList<>();
        pcList.stream().forEach(x-> {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("model",x.getModel().getModel());
            hashMap.put("speed",x.getSpeed());
            hashMap.put("hd",x.getHd());
            pcHashList.add(hashMap);
        });
        return pcHashList;
    }
}
