package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    public List<Vehicule> retrieveAllVehicules();
    public Vehicule retrieveVehicule(Long vehiculeId);
    public Vehicule addVehicule(Vehicule v);

    public void removeVehicule(Long vehiculeId);
    public Vehicule modifyVehicule(Vehicule vehicule);

    public Vehicule affecterVehicule(Long idVehicule, Long idAgence);

    Vehicule affecterEquipement(Long idVehicule, Long idEquipement);
    Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);
}
