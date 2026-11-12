package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IContratService;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeController {
    IEmployeService iEmployeService;
    @GetMapping("employes")
    public List<Employe> getEmployes(){
        return iEmployeService.retrieveAllEmployes();
    }

    @GetMapping("employes/{employeId}")
    public Employe getEmploye(@PathVariable("employeId") Long employeid){
        return iEmployeService.retrieveEmploye(employeid);
    }

    @PostMapping("addEmploye")
    public Employe addEmploye(@RequestBody Employe e){
        return iEmployeService.addEmploye(e);
    }

    @DeleteMapping("deleteEmploye")
    public void removeEmploye(@RequestParam Long employeId){
        iEmployeService.removeEmploye(employeId);
    }

    @PutMapping("modifyEmploye")
    public void modifyEmploye(@RequestBody Employe e){
        iEmployeService.modifyEmploye(e);
    }

    @PutMapping("/affecterEmploye/{idEmploye}/{idAgence}")
    public Employe affecterEmploye(@PathVariable Long idEmploye, @PathVariable Long idAgence) {
        return iEmployeService.affecterEmploye(idEmploye, idAgence);
    }

    @PutMapping("/desaffecterEmploye/{idEmploye}")
    public Employe desaffecterEmploye(@PathVariable Long idEmploye) {
        return iEmployeService.desaffecterEmploye(idEmploye);
    }
}
