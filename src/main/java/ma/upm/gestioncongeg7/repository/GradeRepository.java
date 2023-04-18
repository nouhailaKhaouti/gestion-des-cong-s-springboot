package ma.upm.gestioncongeg7.repository;


import ma.upm.gestioncongeg7.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository        //daughter                 //mother
public interface GradeRepository extends JpaRepository<Grade,Long> {
    public Grade findByLibelle(String id);

}
