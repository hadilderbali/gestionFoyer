package com.example.hadilderbali4se4.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
@Entity
@Getter
@Setter
@Table( name = "universitie")
public class universite implements Serializable {
    @Id
    @GenerateValue  (strategy = GenerationType.IDENTITY)
    @Column(name="iduniversite")
    private long iduniversite;
    private String nomuniversite;
    private String adresse;


    @OneToOne
    @JoinColumn(name = "idFoyer")
    Foyer foyer;

}
