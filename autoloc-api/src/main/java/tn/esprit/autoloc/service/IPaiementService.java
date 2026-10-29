package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    public List<Paiement> retrieveAllPaiements();
    public Paiement retrievePaiement(Long paiementId);
    public Paiement addPaiement(Paiement p);

    public void removePaiement(Long paiementId);
    public Paiement modifyPaiement(Paiement paiement);
}
