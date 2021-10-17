package com.cynthia.eo2Ejercicio2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoRepository repo;

    @GetMapping("/")
    public List<Producto> getAll(){
        return repo.findAll();
    }
}
