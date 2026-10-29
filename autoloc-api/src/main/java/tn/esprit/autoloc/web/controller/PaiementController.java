package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
public class PaiementController {

    IPaiementService iPaiementService;
    @GetMapping("paiements")
    public List<Paiement> getPaiements(){
        return iPaiementService.retrieveAllPaiements();
    }

    @GetMapping("paiements/{paiementId}")
    public Paiement getPaiement (@PathVariable("paiementId") Long paiementid){
        return iPaiementService.retrievePaiement(paiementid);
    }

    @PostMapping("addPaiement")
    public Paiement addPaiement(@RequestBody Paiement p){
        return iPaiementService.addPaiement(p);
    }

    @DeleteMapping("deletePaiement")
    public void removePaiement(@RequestParam Long paiementId){
        iPaiementService.removePaiement(paiementId);
    }

    @PutMapping("modifyPaiement")
    public void modifyPaiement(@RequestBody Paiement p){
        iPaiementService.modifyPaiement(p);
    }
}
