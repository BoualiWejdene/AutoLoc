package tn.esprit.autoloc.web.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
public class AgenceController {

    IAgenceService iAgenceService;

    @GetMapping("agences")
    public List<Agence> getAgences(){
        return iAgenceService.retrieveAllAgences();
    }

    @GetMapping("agences/{agenceId}")
    public Agence getAgence(@PathVariable("agenceId") Long agenceid){
        return iAgenceService.retrieveAgence(agenceid);
    }

    @PostMapping("addAgence")
    public Agence addAgence(@RequestBody Agence a){
        return iAgenceService.addAgence(a);
    }

    @DeleteMapping("deleteAgence")
    public void removeAgence(@RequestParam Long agenceId){
        iAgenceService.removeAgence(agenceId);
    }

    @PutMapping("modifyAgence")
    public void modifyAgence(@RequestBody Agence a){
        iAgenceService.modifyAgence(a);
    }






}
