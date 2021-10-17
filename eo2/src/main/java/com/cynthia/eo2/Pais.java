package com.cynthia.eo2;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder
@Getter @Setter
@Table(name= "country")
public class Pais implements Serializable {

    @Id
    @Column(name= "id", nullable = false , unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name= "name", nullable = false, length = 128)
    private String nombre;
}