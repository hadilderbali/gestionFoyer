package service.java;
import com.example.hadilderbali4se4.entity.Foyer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repostries.IFoyerRepository;

import java.util.Collections;
import java.util.List;
@RequiredArgsConstructor
@Service
public class Foyerservice implements IFoyerService {
    private final IFoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        if (foyer.getIdFoyer() != 0) {
            Foyer existingFoyer = foyerRepository.findById(foyer.getIdFoyer()).orElse(null);
            if (existingFoyer != null) {
                if (foyer.getNomFoyer() != null) {
                    existingFoyer.setNomFoyer(foyer.getNomFoyer());
                }
                if (foyer.getCapaciteFoyer() != 0) {
                    existingFoyer.setCapaciteFoyer(foyer.getCapaciteFoyer());
                }
                if (foyer.getUniversite() != null) {
                    existingFoyer.setUniversite(foyer.getUniversite());
                }
                if (foyer.getBlocs() != null) {
                    existingFoyer.setBlocs(foyer.getBlocs());
                }
                return foyerRepository.save(existingFoyer);
            }
        }
        return null;


    }

    @Override
    public List<Foyer> getAllFoyers() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer getFoyerById(Long idFoyer) {
        return (Foyer) foyerRepository.findAllById(Collections.singleton(idFoyer));
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}