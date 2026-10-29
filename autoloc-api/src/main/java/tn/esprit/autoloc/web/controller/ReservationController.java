package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {


    IReservationService iReservationService;
    @GetMapping("reservations")
    public List<Reservation> getReservations(){
        return iReservationService.retrieveAllReservations();
    }

    @GetMapping("reservations/{reservationId}")
    public Reservation getReservation (@PathVariable("reservationId") Long reservationid){
        return iReservationService.retrieveReservation(reservationid);
    }

    @PostMapping("addReservation")
    public Reservation addReservation(@RequestBody Reservation r){
        return iReservationService.addReservation(r);
    }

    @DeleteMapping("deleteReservation")
    public void removeReservation(@RequestParam Long reservationId){
        iReservationService.removeReservation(reservationId);
    }

    @PutMapping("modifyReservation")
    public void modifyReservation(@RequestBody Reservation r){
        iReservationService.modifyReservation(r);
    }
}
