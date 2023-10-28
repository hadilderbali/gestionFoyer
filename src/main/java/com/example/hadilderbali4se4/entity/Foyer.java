package com.example.hadilderbali4se4.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table( name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private long idFoyer;
    private String nomFoyer;
    private  long capaciteFoyer;

   @OneToOne(mappedBy="foyer")
    universite Universite;
   @OneToMany(mappedBy="foyer")
    Set<Bloc> blocs;
}

