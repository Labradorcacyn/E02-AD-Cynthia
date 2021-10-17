package com.cynthia.eo2Ejercicio2;

import lombok.*;

import javax.persistence.*;
//import java.util.UUID;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder @Table(name = "product")
public class Producto {

   @Id
   @Column(name = "id", nullable = false, unique = true)
   @GeneratedValue(strategy = GenerationType.AUTO)
   //private UUID id;
   private Long id;

   @Column(name = "name", nullable = false, length = 255)
   private String nombre;

   @Column(name = "price", nullable = false)
   private double precio;

   @Column(name = "image")
   private String imagen;

   @Lob
   @Column(name = "description")
   private String descripcion;
}
