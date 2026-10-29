package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EquipementController {

    IEquipementService iEquipementService;
    @GetMapping("equipements")
    public List<Equipement> getEquipements(){
        return iEquipementService.retrieveAllEquipements();
    }

    @GetMapping("equipements/{equipementId}")
    public Equipement getEquipement(@PathVariable("equipementId") Long equipementid){
        return iEquipementService.retrieveEquipement(equipementid);
    }

    @PostMapping("addEquipement")
    public Equipement addEquipement(@RequestBody Equipement e){
        return iEquipementService.addEquipement(e);
    }

    @DeleteMapping("deleteEquipement")
    public void removeEquipement(@RequestParam Long equipementId){
        iEquipementService.removeEquipement(equipementId);
    }

    @PutMapping("modifyEquipement")
    public void modifyEquipement(@RequestBody Equipement e){
        iEquipementService.modifyEquipement(e);
    }
}
