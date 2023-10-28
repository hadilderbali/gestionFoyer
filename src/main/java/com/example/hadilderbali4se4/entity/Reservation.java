package com.example.hadilderbali4se4.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@Table( name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;


    @ManyToMany
    Set<Etudiant> etudiants;

}
