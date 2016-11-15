package nl.marktweb.services;

import nl.marktweb.models.*;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;





public class PersonListing {
	@PersistenceContext 
	EntityManager em;

	public List<Person> getAllPersons() {
		return em.createQuery("select p from Person p", Person.class).getResultList();
	}
}
