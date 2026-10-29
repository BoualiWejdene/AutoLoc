package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
public class VehiculeController {

    IVehiculeService iVehiculeService;
    @GetMapping("vehicules")
    public List<Vehicule> getVehicules(){
        return iVehiculeService.retrieveAllVehicules();
    }

    @GetMapping("vehicules/{vehiculeId}")
    public Vehicule getVehicule (@PathVariable("vehiculeId") Long vehiculeid){
        return iVehiculeService.retrieveVehicule(vehiculeid);
    }

    @PostMapping("addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v){
        return iVehiculeService.addVehicule(v);
    }

    @DeleteMapping("deleteVehicule")
    public void removeVehicule(@RequestParam Long vehiculeId){
        iVehiculeService.removeVehicule(vehiculeId);
    }

    @PutMapping("modifyVehicule")
    public void modifyVehicule(@RequestBody Vehicule v){
        iVehiculeService.modifyVehicule(v);
    }
}
