package service.java;
import com.example.hadilderbali4se4.entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation getReservationById(Long idReservation);
    void deleteReservation(Long idReservation);
}