package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;

public interface IAgenceService {
    public List<Agence> retrieveAllAgences();
    public Agence retrieveAgence(Long agenceId);
    public Agence addAgence(Agence a);

    public void removeAgence(Long agenceId);
    public Agence modifyAgence(Agence agence);
}
