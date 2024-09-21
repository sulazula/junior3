package org.example.repo;
import javax.persistence.*;

public class PersonRepo {
    EntityManagerFactory emf;

    public PersonRepo() {
        emf = Persistence.createEntityManagerFactory("personPU");
    }

    public void addPerson(Person person) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(person);
        transaction.commit();
        em.close();
    }

    public void updatePerson(Person person) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(person);
        transaction.commit();
        em.close();
    }

    public void deletePerson(Person person) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(person);
        transaction.commit();
        em.close();
    }

    public Person findPersonById(Long id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Person person = em.find(Person.class, id);
        transaction.commit();
        em.close();
        return person;
    }

}
