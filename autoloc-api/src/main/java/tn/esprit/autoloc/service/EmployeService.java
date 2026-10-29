package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.EmployeRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService{
    final EmployeRepository employeRepository;
    @Override
    public List<Employe> retrieveAllEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe retrieveEmploye(Long employetId) {
        return employeRepository.findById(employetId).get();
    }

    @Override
    public Employe addEmploye(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public void removeEmploye(Long employeId) {
        employeRepository.deleteById(employeId);
    }

    @Override
    public Employe modifyEmploye(Employe employe) {
        return employeRepository.save(employe);
    }
}
