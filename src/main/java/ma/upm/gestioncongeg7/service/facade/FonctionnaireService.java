package ma.upm.gestioncongeg7.service.facade;

import ma.upm.gestioncongeg7.model.Fonctionnaire;
import ma.upm.gestioncongeg7.model.Grade;
import ma.upm.gestioncongeg7.model.Service;

import java.util.List;

public interface FonctionnaireService {
    int create(Fonctionnaire fonctionnaire);
    int update(String ppr,Fonctionnaire fonctionnaire);
     Fonctionnaire findByPpr(String ppr);
//     Fonctionnaire findbySolde(Integer solde);
     Fonctionnaire findByGrade(Grade grade);
     Fonctionnaire findByService(Service service);
     List<Fonctionnaire > findAll();

}
