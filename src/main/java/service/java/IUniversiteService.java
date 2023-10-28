package service.java;
import com.example.hadilderbali4se4.entity.universite;

import java.util.List;

public interface IUniversiteService {
    universite adduniversite(universite Universite);
    universite updateuniversite(universite Universite);
    List<universite> getAlluniversites();
    universite getuniversiteById(Long iduniversite);
    void deleteuniversite(Long iduniversite);

}
