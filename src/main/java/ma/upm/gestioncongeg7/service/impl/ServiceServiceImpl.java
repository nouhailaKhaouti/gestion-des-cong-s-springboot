package ma.upm.gestioncongeg7.service.impl;

import lombok.AllArgsConstructor;
import ma.upm.gestioncongeg7.model.Service;
import ma.upm.gestioncongeg7.repository.ServiceRepository;
import ma.upm.gestioncongeg7.service.facade.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    final ServiceRepository serviceRepository;

    @Override
    public int create(Service service) {
        Service serviceLoaded= serviceRepository.findByLibelle(service.getLibelle() );
        if (serviceLoaded!=null){
            return -1;
        }else{
            serviceRepository.save(service);
            return 1;
        }
    }

    @Override
    public int update(String libelle,Service service) {
        Service serviceLoaded = findByLibelle(libelle);
        if (serviceLoaded==null){
            return -1;
        }else{
            serviceLoaded.setLibelle(service.getLibelle());
            serviceRepository.save(serviceLoaded);
            return 1;
        }

    }


    @Override
    public Service findByLibelle(String libelle) {
        return serviceRepository.findByLibelle(libelle);
    }

    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }
}
