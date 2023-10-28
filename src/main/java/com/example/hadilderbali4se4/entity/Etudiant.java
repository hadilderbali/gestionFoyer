package com.example.hadilderbali4se4.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter ;
import java.util.Set;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(mappedBy="etudiants")
    Set<Reservation> reservations;
}
