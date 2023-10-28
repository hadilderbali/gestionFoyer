package com.example.hadilderbali4se4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table( name = "chambre")
public class chambre implements Serializable {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name="idchambre")
    private long idchambre;
    private String numerochambre;
    @Enumerated(EnumType.STRING)
    private Typechambre typeC ;

    @ManyToOne
@JoinColumn(name = "idBloc")
Bloc bloc;

    @OneToMany
    Set<Reservation> reservations;
}
