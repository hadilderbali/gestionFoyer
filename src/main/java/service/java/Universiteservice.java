package service.java;
import com.example.hadilderbali4se4.entity.universite;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repostries.IUniversiteRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class Universiteservice implements IUniversiteService {
    public final IUniversiteRepository universiteRepository ;
    @Override
    public universite adduniversite(universite Universite) {
        return (universite) universiteRepository.save(Universite);
    }
    @Override
    public universite updateuniversite(universite Universite) {
        if (Universite.getIduniversite() != 0) {
            universite  existingUniversite = universiteRepository.findById(Universite.getIduniversite()).orElse(null);
            if (existingUniversite != null) {
                if (Universite != null) {
                    existingUniversite.setNomuniversite(Universite.getNomuniversite());
                }
                if (Universite.getAdresse() != null) {
                    existingUniversite.setAdresse(Universite.getAdresse());
                }
                if (Universite.getFoyer() != null) {
                    existingUniversite.setFoyer(Universite.getFoyer());
                }
                return universiteRepository.save(existingUniversite);
            }
        }
        return null;


    }

    @Override
    public List<universite> getAlluniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public universite getuniversiteById(Long iduniversite) {

        return  universiteRepository.findById(iduniversite).orElse(null);
    }

    @Override
    public void deleteuniversite(Long iduniversite) {
        universiteRepository.deleteById(iduniversite);
    }
}
