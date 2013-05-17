package com.myproject.jpaexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.myproject.jpaexample.domain.Person;

public class MainExec {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MainExec.class);
	
	private EntityManager em;

	public MainExec(EntityManager em) {
		this.em = em;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
		EntityManager em = factory.createEntityManager();
		MainExec mainExec = new MainExec(em);
		int peoples  = mainExec.countPeople();
		log.info("How many people? " + peoples);
		
		log.info("Create people");
		mainExec.createPeople();
		peoples  = mainExec.countPeople();
		log.info("How many people? " + peoples);
		log.info("They are: ");
		List<Person> listPeople = mainExec.listAllPerson();
		for(Person person : listPeople) {
			log.info(person.toString());
		}
		
		em.close();
		factory.close();
		
		

	}
	
	public void createPeople() {
		try {
			EntityTransaction transaction = em.getTransaction();
			
			transaction.begin();
			
			em.persist(peopleMaker("Shane", "Jones"));
			Person jim = peopleMaker("Jim", "Smith");
			jim.setAge(37);
			em.persist(jim);
			em.persist(peopleMaker("paula", "Fairfield"));
			em.flush();
			
			transaction.commit();
		} catch (RuntimeException re) {
			throw re;
		} 
	}
	
	public int countPeople() {
		return em.createQuery("Select p from Person p").getResultList().size();
	}
	
	public Person peopleMaker(String first, String last) {
		Person person = new Person();
		person.setFirstName(first);
		person.setLastName(last);
		return person;
	}
	
	public List<Person> listAllPerson() {
		return em.createQuery("Select p from Person p").getResultList();
	}

}
