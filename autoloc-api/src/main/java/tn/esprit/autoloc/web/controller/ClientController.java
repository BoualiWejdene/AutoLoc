package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientController {
    IClientService iClientService;

    @GetMapping("clients")
    public List<Client> getClients(){
        return iClientService.retrieveAllClient();
    }

    @GetMapping("clients/{clientId}")
    public Client getClient(@PathVariable("clientId") Long clientid){
        return iClientService.retrieveClient(clientid);
    }

    @PostMapping("addClient")
    public Client addClient(@RequestBody Client a){
        return iClientService.addClient(a);
    }

    @DeleteMapping("deleteClient")
    public void removeClient(@RequestParam Long clientId){
        iClientService.removeClient(clientId);
    }

    @PutMapping("modifyClient")
    public void modifyClient(@RequestBody Client a){
        iClientService.modifyClient(a);
    }

}
