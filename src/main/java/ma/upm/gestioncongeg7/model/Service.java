package ma.upm.gestioncongeg7.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Service {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)

    private Long id  ;
    private String libelle;

}
