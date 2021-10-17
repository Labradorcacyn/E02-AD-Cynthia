package com.cynthia.eo2Ejercicio2;

import org.springframework.data.jpa.repository.JpaRepository;
/*
import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
}
*/
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}