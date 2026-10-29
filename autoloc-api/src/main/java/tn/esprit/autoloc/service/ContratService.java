package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ContratService implements IContratService{

    final ContratRepository contratRepository;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat retrieveContrat(Long contratId) {
        return contratRepository.findById(contratId).get();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public void removeContrat(Long contratId) {
            contratRepository.deleteById(contratId);
    }

    @Override
    public Contrat modifyContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }
}
