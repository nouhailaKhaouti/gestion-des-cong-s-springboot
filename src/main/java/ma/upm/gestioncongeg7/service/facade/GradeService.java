package ma.upm.gestioncongeg7.service.facade;

import ma.upm.gestioncongeg7.model.Grade;

import java.util.List;

public interface GradeService {
    int create(Grade grade);
    int update(String libelle,Grade grade);
    Grade findByLibelle(String libelle);
    List<Grade> findAll();

}
