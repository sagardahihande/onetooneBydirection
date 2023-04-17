package onetooneBydirection.controllor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneBydirection.dto.Pancard;
import onetooneBydirection.dto.Person;

public class DriveSave {
	
	
	public static void main(String[] args) {
		
		Person person = new Person();
		Pancard card = new Pancard();
		card.setPancardid(101);
		card.setName("sagar");
		card.setAddress("pune");
		
		person.setPersonid(1);
		person.setName("sagar");
		person.setAddress("pune");
		
		person.setPancard(card);
		card.setPerson(person);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sagar");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(card);
		em.persist(person);
		et.commit();
	}

}
