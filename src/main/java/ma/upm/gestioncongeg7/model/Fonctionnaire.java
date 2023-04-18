package ma.upm.gestioncongeg7.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Fonctionnaire {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)

    private Long id  ;
    private String ppr;
    private String nom;
    private String prenom;
    private String genre;
    @ManyToOne
    @JoinColumn(name = "grade_id")
    private Grade grade;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
    private Integer solde;

}
