package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.ClientRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientService implements IClientService{

    final ClientRepository clientRepository;
    @Override
    public List<Client> retrieveAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client retrieveClient(Long clientId) {
        return clientRepository.findById(clientId).get();
    }

    @Override
    public Client addClient(Client a) {
        return clientRepository.save(a);
    }

    @Override
    public void removeClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }

    @Override
    public Client modifyClient(Client client) {
        return clientRepository.save(client);
    }
}
