package service.java;

import com.example.hadilderbali4se4.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    List<Foyer> getAllFoyers();
    Foyer getFoyerById(Long idFoyer);
    void deleteFoyer(Long idFoyer);
}