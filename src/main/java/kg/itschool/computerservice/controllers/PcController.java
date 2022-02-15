package kg.itschool.computerservice.controllers;


import kg.itschool.computerservice.models.dto.Pc1ExDTO;
import kg.itschool.computerservice.models.dto.Pc1ExDTOinterface;
import kg.itschool.computerservice.models.entities.Pc;
import kg.itschool.computerservice.services.PcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

//hello from git editor

@RestController
@RequestMapping("api/v1/pc")
public class PcController {

    private PcService pcService;

    public PcController(PcService pcService) {
        this.pcService = pcService;
    }

    @GetMapping("/ex1")
    public List<Pc> getAllPcsLessThanPrice(@RequestParam(required = false,defaultValue = "0.0") Double price){
        System.out.println(price);
        return pcService.getAllPriceLessThanPrice(price);

    }

    @GetMapping("/ex1dto")
    public List<Pc1ExDTO> getAll(@RequestParam Double price, HttpServletRequest request){
        return pcService.getAll(price);
    }

    @GetMapping("/interface")
    public List<Pc1ExDTOinterface> getAllPC(@RequestParam  double price){
        return pcService.getAllInterface(price);
    }

    @GetMapping("/hashmap")
    public List<HashMap<String,Object>> getAllHash(@RequestParam  Double price){
        return pcService.getHash(price);
    }
 }
