package com.cynthia.eo2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/country")
public class PaisController{

    private final PaisRepository repo;

    @GetMapping("/")
    public List<Pais> selectAll(){
        return repo.findAll();
    }
}
