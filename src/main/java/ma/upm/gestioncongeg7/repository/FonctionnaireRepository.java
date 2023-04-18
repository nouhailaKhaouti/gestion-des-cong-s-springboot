
package ma.upm.gestioncongeg7.repository;


import ma.upm.gestioncongeg7.model.Fonctionnaire;
import ma.upm.gestioncongeg7.model.Grade;
import ma.upm.gestioncongeg7.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionnaireRepository extends JpaRepository<Fonctionnaire,Long> {
    public Fonctionnaire findByPpr(String ppr);
//    public Fonctionnaire findbySolde(Integer solde);
    public Fonctionnaire findByGrade(Grade grade);
    public Fonctionnaire findByService(Service service);

}
