package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ContratController {

    IContratService iContratService;
    @GetMapping("contrats")
    public List<Contrat> getContrats(){
        return iContratService.retrieveAllContrats();
    }

    @GetMapping("contrats/{contratId}")
    public Contrat getContrat(@PathVariable("contratId") Long contratid){
        return iContratService.retrieveContrat(contratid);
    }

    @PostMapping("addContrat")
    public Contrat addContrat(@RequestBody Contrat c){
        return iContratService.addContrat(c);
    }

    @DeleteMapping("deleteContrat")
    public void removeContrat(@RequestParam Long contratId){
        iContratService.removeContrat(contratId);
    }

    @PutMapping("modifyContrat")
    public void modifyContrat(@RequestBody Contrat c){
        iContratService.modifyContrat(c);
    }
}
