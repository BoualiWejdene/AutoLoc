package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    public List<Maintenance> retrieveAllMaintenances();
    public Maintenance retrieveMaintenance(Long maintenanceId);
    public Maintenance addMaintenance(Maintenance m);

    public void removeMaintenance(Long maintenanceId);
    public Maintenance modifyMaintenance(Maintenance maintenance);
}
