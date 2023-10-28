package service.java;

import com.example.hadilderbali4se4.entity.Etudiant;
import repostries.IEtudiantRepository;
import org.springframework.stereotype.Service;
import  lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.Collection;
@RequiredArgsConstructor
@Service
public class Etudiantservice implements IEtudiantService {
    public final IEtudiantRepository etudiantRepository ;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return (Etudiant) etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {

        if (etudiant.getIdEtudiant() != 0) {
            Etudiant existingEtudiant = etudiantRepository.findById(etudiant.getIdEtudiant()).orElse(null);
            if (existingEtudiant != null) {
                if (etudiant.getNomEt() != null) {
                    existingEtudiant.setNomEt(etudiant.getNomEt());
                }
                if (etudiant.getPrenomEt() != null) {
                    existingEtudiant.setPrenomEt(etudiant.getPrenomEt());
                }
                if (etudiant.getCin() != 0) {
                    existingEtudiant.setCin(etudiant.getCin());
                }
                if (etudiant.getDateNaissance() != null) {
                    existingEtudiant.setDateNaissance(etudiant.getDateNaissance());
                }
                if (etudiant.getEcole() != null) {
                    existingEtudiant.setEcole(etudiant.getEcole());
                }
                if (etudiant.getReservations() != null) {
                    existingEtudiant.setReservations(etudiant.getReservations());
                }
                return etudiantRepository.save(existingEtudiant);
            }
        }
        return null;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(Long idEtudiant) {
        return (Etudiant) etudiantRepository.findAllById(Collections.singleton(idEtudiant));
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
            etudiantRepository.deleteById(idEtudiant);
    }
}
