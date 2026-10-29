package tn.esprit.autoloc.service;


import tn.esprit.autoloc.domain.Client;

import java.util.List;

public interface IClientService {
    public List<Client> retrieveAllClient();
    public Client retrieveClient(Long clientId);
    public Client addClient(Client a);

    public void removeClient(Long clientId);
    public Client modifyClient(Client client);
}
