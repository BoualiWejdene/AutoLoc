package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Equipement;

import java.util.List;

public interface IEquipementService {
    public List<Equipement> retrieveAllEquipements();
    public Equipement retrieveEquipement(Long equipementId);
    public Equipement addEquipement(Equipement e);

    public void removeEquipement(Long equipementId);
    public Equipement modifyEquipement(Equipement equipement);
}
