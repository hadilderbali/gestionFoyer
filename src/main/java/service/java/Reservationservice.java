package service.java;
import com.example.hadilderbali4se4.entity.Reservation;
import com.example.hadilderbali4se4.entity.chambre;
import repostries.IReservationRepository;
import lombok.RequiredArgsConstructor ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@RequiredArgsConstructor
@Service
public class Reservationservice implements IReservationService{
      private final IReservationRepository reservationRepository ;

    @Override
    public Reservation addReservation(Reservation reservation) {

        return (Reservation) reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        if (reservation.getIdReservation() != null) {
            Reservation existingReservation = reservationRepository.findById(Long.valueOf(reservation.getIdReservation())).orElse(null);
            if (existingReservation != null) {
                if (reservation.getAnneeUniversitaire() != null) {
                    existingReservation.setAnneeUniversitaire(reservation.getAnneeUniversitaire());
                }
                if (reservation.getEtudiants() != null) {
                    existingReservation.setEtudiants(reservation.getEtudiants());
                }
                return reservationRepository.save(existingReservation);
            }
        }
        return null;
    }

    @Override
    public List<Reservation> getAllReservations() {

        return (List<Reservation>) reservationRepository.findAll(); }

    @Override
    public Reservation getReservationById(Long idReservation) {

        return (Reservation) reservationRepository.findAllById(Collections.singleton(idReservation));
    }

    @Override
    public void deleteReservation(Long idReservation) {

        reservationRepository.deleteById(idReservation);
    }
}
