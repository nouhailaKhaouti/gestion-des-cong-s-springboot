package ma.upm.gestioncongeg7.service.facade;

import ma.upm.gestioncongeg7.model.Service;

import java.util.List;

public interface ServiceService {
    int create(Service service);
    int update(String libelle,Service service);
    Service findByLibelle(String libelle);
    List<Service> findAll();

}
