package service.java;

import com.example.hadilderbali4se4.entity.chambre;
import java.util.List;
import java.util.Optional;

public interface IChambreService {
    chambre addchambre(chambre Chambre);

    chambre updateChambre(chambre Chambre );

     List<chambre> getAllChambres() ;

    Optional<chambre> getChambreById(Long idchambre);
    void deletechambre(Long idchambre);

}