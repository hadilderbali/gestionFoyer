package service.java;
import com.example.hadilderbali4se4.entity.chambre;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repostries.IChambreRepository;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Chambreservice implements IChambreService{
    public final IChambreRepository chambreRepository;

    @Override
    public chambre addchambre(chambre Chambre) {
        return chambreRepository.save(Chambre);
    }

    @Override
    public chambre updateChambre(chambre Chambre) {

        if (Chambre.getIdchambre() != 0) {
            chambre existingChambre = chambreRepository.findById(Chambre.getIdchambre()).orElse(null);
            if (existingChambre != null) {
                if (Chambre.getNumerochambre() != null) {
                    existingChambre.setNumerochambre(Chambre.getNumerochambre());
                }
                if (Chambre.getTypeC() != null) {
                    existingChambre.setTypeC(Chambre.getTypeC());
                }
                if (Chambre.getBloc() != null) {
                    existingChambre.setBloc(Chambre.getBloc());
                }
                if (Chambre.getReservations() != null) {
                    existingChambre.setReservations(Chambre.getReservations());
                }
                return chambreRepository.save(existingChambre);
            }
        }
        return null;    }

    @Override
    public List<chambre> getAllChambres() {
        return  chambreRepository.findAll();
    }

    @Override
    public Optional<chambre> getChambreById(Long idchambre) {
        return chambreRepository.findById(idchambre);
    }

    @Override
    public void deletechambre(Long idchambre) {
         chambreRepository.deleteById(idchambre);
    }
}


