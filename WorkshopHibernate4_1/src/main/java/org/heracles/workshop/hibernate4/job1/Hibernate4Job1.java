package org.heracles.workshop.hibernate4.job1;

import org.heracles.workshop.hibernate4.job1.modele.Atelier;
import org.heracles.workshop.hibernate4.job1.utils.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.Date;
import java.util.List;

/**
 * Created by MOKRANI on 25/04/2016.
 */
public class Hibernate4Job1
{

    public static void main(String[] args) {
        //Récuperer une session Hibernate 4
        Session session = HibernateUtil.getSessionFactory().openSession();
        //Débuter la transaction
        session.beginTransaction();
        //Préparer l'entité à persister
        Atelier atelier = new Atelier("Hibernate 4", "Atelier Hibernate 4",  "Atelier Hibernate 4 JOB 1", new Date(), new Date());
        //Enregister
        session.persist(atelier);
        //Terminer la transaction
        session.getTransaction().commit();
        //Préparer une requête pour les restitution
        Query q = session.createQuery("From org.heracles.workshop.hibernate4.job1.modele.Atelier ");
        List<Atelier> resultList = q.list();
        //Imprimer la liste des resultats
        System.out.println("num of Atelier:" + resultList.size());
        for (Atelier next : resultList) {
            System.out.println("next employee: " + next);
        }
    }

}
