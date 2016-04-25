package org.heracles.workshop.hibernate4.job1.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by MOKRANI on 25/04/2016.
 */
@Entity
@Table
public class Atelier implements Serializable {

    @Id
    @GeneratedValue
    private Integer idatelier ;
    private String nom ;
    private String description;
    private String objectif;
    private Date dtcreation;
    private Date dtmaj ;

    public Atelier() {
    }

    public Atelier(String nom, String description, String objectif, Date dtcreation, Date dtmaj) {
        this.nom = nom;
        this.description = description;
        this.objectif = objectif;
        this.dtcreation = dtcreation;
        this.dtmaj = dtmaj;
    }

    public Integer getIdatelier() {
        return idatelier;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getObjectif() {
        return objectif;
    }

    public Date getDtcreation() {
        return dtcreation;
    }

    public Date getDtmaj() {
        return dtmaj;
    }

    public void setIdatelier(Integer idatelier) {
        this.idatelier = idatelier;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public void setDtcreation(Date dtcreation) {
        this.dtcreation = dtcreation;
    }

    public void setDtmaj(Date dtmaj) {
        this.dtmaj = dtmaj;
    }
}
