package com.example.hadilderbali4se4.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private long idBloc;
    private String nomBloc;
    private  long capaciteBloc ;

    @ManyToOne
    @JoinColumn(name = "idFoyer")
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    Set<chambre> chambres;
}