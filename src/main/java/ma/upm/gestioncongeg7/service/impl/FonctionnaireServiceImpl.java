package ma.upm.gestioncongeg7.service.impl;

import lombok.AllArgsConstructor;
import ma.upm.gestioncongeg7.model.Fonctionnaire;
import ma.upm.gestioncongeg7.model.Grade;
import ma.upm.gestioncongeg7.model.Service;
import ma.upm.gestioncongeg7.repository.FonctionnaireRepository;
import ma.upm.gestioncongeg7.service.facade.FonctionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class FonctionnaireServiceImpl implements FonctionnaireService {

    final FonctionnaireRepository fonctionnaireRepository;

    @Override
    public int create(Fonctionnaire fonctionnaire) {
        Fonctionnaire fonctionnaireLoaded= fonctionnaireRepository.findByPpr(fonctionnaire.getPpr() );
        if (fonctionnaireLoaded!=null){
            return -1;
        }else{
            fonctionnaireRepository.save(fonctionnaire);
            return 1;
        }
    }

    @Override
    public int update(String ppr,Fonctionnaire fonctionnaire) {
        Fonctionnaire fonctionnaireLoaded = findByPpr(ppr);
        if (fonctionnaireLoaded==null){
            return -1;
        }else{
            fonctionnaireLoaded.setPpr(fonctionnaire.getPpr());
            fonctionnaireRepository.save(fonctionnaireLoaded);
            return 1;
        }

    }


    @Override
    public Fonctionnaire findByPpr(String ppr) {
        return fonctionnaireRepository.findByPpr(ppr);
    }

//    @Override
//    public Fonctionnaire findBySolde(Integer solde) {
//        return fonctionnaireRepository.findBySolde(solde);
//    }

    @Override
    public Fonctionnaire findByGrade(Grade grade) {
        return fonctionnaireRepository.findByGrade(grade);
    }
    @Override
    public Fonctionnaire findByService(Service service) {
        return fonctionnaireRepository.findByService(service);
    }
    @Override
    public List<Fonctionnaire> findAll() {
        return fonctionnaireRepository.findAll();
    }
}
