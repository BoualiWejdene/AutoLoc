package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
public class MaintenanceController {

    IMaintenanceService iMaintenanceService;
    @GetMapping("maintenances")
    public List<Maintenance> getMaintenances(){
        return iMaintenanceService.retrieveAllMaintenances();
    }

    @GetMapping("maintenances/{maintenanceId}")
    public Maintenance getMaintenance (@PathVariable("maintenanceId") Long maintenanceid){
        return iMaintenanceService.retrieveMaintenance(maintenanceid);
    }

    @PostMapping("addMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance e){
        return iMaintenanceService.addMaintenance(e);
    }

    @DeleteMapping("deleteMaintenance")
    public void removeMaintenance(@RequestParam Long maintenanceId){
        iMaintenanceService.removeMaintenance(maintenanceId);
    }

    @PutMapping("modifyMaintenance")
    public void modifyMaintenance(@RequestBody Maintenance m){
        iMaintenanceService.modifyMaintenance(m);
    }
}
