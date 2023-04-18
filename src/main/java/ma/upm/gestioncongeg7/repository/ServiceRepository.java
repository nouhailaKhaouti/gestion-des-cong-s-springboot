package ma.upm.gestioncongeg7.repository;


import ma.upm.gestioncongeg7.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
    public Service findByLibelle(String libelle);

}
