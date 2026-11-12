package tn.esprit.autoloc.service;



import tn.esprit.autoloc.domain.Employe;

import java.util.List;

public interface IEmployeService {
    public List<Employe> retrieveAllEmployes();
    public Employe retrieveEmploye(Long employetId);
    public Employe addEmploye(Employe e);

    public void removeEmploye(Long employeId);
    public Employe modifyEmploye(Employe employe);

    public Employe desaffecterEmploye(Long idEmploye);

    public Employe affecterEmploye(Long idEmploye, Long idAgence);
}
