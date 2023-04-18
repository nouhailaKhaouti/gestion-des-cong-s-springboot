package ma.upm.gestioncongeg7.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Grade model has two attributs that specify it which are id and libelle
@Entity  // bach tdar table f la base creat grade table in database auto
@Data  //to creat getters and setters
public class Grade {
    @Id // bach hada iwli ID f la table cote base donnees (unique id )
    @GeneratedValue(strategy= GenerationType.SEQUENCE)//  bach iwli id auto incremeent

    private Long id  ;
    private String libelle;
    //???
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
