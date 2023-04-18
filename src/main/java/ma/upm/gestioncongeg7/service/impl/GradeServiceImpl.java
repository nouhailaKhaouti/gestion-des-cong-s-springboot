package ma.upm.gestioncongeg7.service.impl;

import lombok.AllArgsConstructor;
import ma.upm.gestioncongeg7.model.Grade;
import ma.upm.gestioncongeg7.repository.GradeRepository;
import ma.upm.gestioncongeg7.service.facade.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GradeServiceImpl implements GradeService {
    final GradeRepository gradeRepository;

    @Override
    public int create(Grade grade) {
        Grade gradeLoaded= gradeRepository.findByLibelle(grade.getLibelle() );
        if (gradeLoaded!=null){                   // f had lhala had lobjet deja kayn f la base
            return -1;                            // ghadi nroutourniw -1 w nkhrjo men create
        }else{
            gradeRepository.save(grade);           //hna tan3iyeto l save li kayna f repository lkbira
            return 1;                               // kolchi daz bikhir w 3la khir tanrontourniw 1 w tankono salina create
        }
    }


    @Override
    public int update(String libelle,Grade grade) {  //id: dyal l9dim + grade: objet jdid
        Grade gradeLoaded = findByLibelle(libelle);     // awal haja ghanverifyiw wach nit kayn f la base
        if (gradeLoaded==null){                // ila mal9ahch return -1
            return -1;
        }else{
            gradeLoaded.setLibelle(grade.getLibelle());  //ila l9ah ghadi imodifyi
            gradeRepository.save(gradeLoaded);              // men be3d ghadi isejel la modification b save li f repository
            return 1;                   // w ghadi iroutouni 1
        }

    }


    @Override
    public Grade findByLibelle(String libelle) {
        return gradeRepository.findByLibelle(libelle);
    }

    @Override
    public List<Grade> findAll() {
        return gradeRepository.findAll();
    }

}
