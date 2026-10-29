package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService{
    final EquipementRepository equipementRepository;
    @Override
    public List<Equipement> retrieveAllEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement retrieveEquipement(Long equipementId) {
        return equipementRepository.findById(equipementId).get();
    }

    @Override
    public Equipement addEquipement(Equipement e) {
        return equipementRepository.save(e);
    }

    @Override
    public void removeEquipement(Long equipementId) {
            equipementRepository.deleteById(equipementId);
    }

    @Override
    public Equipement modifyEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }
}
