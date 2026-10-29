package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.repository.MaintenanceRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService{
    final MaintenanceRepository maintenanceRepository;
    @Override
    public List<Maintenance> retrieveAllMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance retrieveMaintenance(Long maintenanceId) {
        return maintenanceRepository.findById(maintenanceId).get();
    }

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return maintenanceRepository.save(m);
    }

    @Override
    public void removeMaintenance(Long maintenanceId) {
            maintenanceRepository.deleteById(maintenanceId);
    }

    @Override
    public Maintenance modifyMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }
}
