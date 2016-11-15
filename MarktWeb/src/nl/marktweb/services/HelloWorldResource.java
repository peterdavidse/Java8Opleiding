package nl.marktweb.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;


import javax.transaction.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.Query;
import javax.persistence.NamedQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.marktweb.models.Item;
import nl.marktweb.models.Person;

@Path("/HelloWorld")
public class HelloWorldResource {
 
	@PersistenceContext
	private EntityManager em;
	

	/* CriteriaBuilder cb = em.getCriteriaBuilder();
	CriteriaQuery<Person> cq = cb.createQuery(Person.class);
	Root<Person> Person = cq.from(Person.class);
	cq.select(person);
	TypedQuery<Person> q = em.createQuery(cq);
	List<Person> allPersons = q.getResultList();
	*/
	
	/* @GET
	@Path("/sayHello")
	public String sayHello() {
		return "<h1>Hello World</h1>";
	}
 
	@GET
	@Path("/person/1")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson() {
		return new Person("Donald", "Duck");
	}
	*/
	/*
	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPersons() {
		@SuppressWarnings("unchecked")
		List<Person> personList = new ArrayList<>();
		//personList.add(new Person("Donald", "Duck"));
		//personList.add(new Person("Koning", "Willem-Alexander"));
		Query q1 = em.createQuery("SELECT c FROM Person c");
		personList = q1.getResultList();
		return personList;
	}
	*/
	@GET
	@Path("/item")
	@Produces(MediaType.APPLICATION_JSON)
		public List<Item> getItem() {
			@SuppressWarnings("unchecked")
		    List<Item> itemList = new ArrayList<>();
				Query qitems = em.createQuery("SELECT i FROM Item i"); //
			    itemList=qitems.getResultList();
		        return itemList;
		}	


	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPersons() {
		@SuppressWarnings("unchecked")
		List<Person> personList = new ArrayList<>();
		//personList.add(new Person("Donald", "Duck"));
		//personList.add(new Person("Koning", "Willem-Alexander"));
		Query q1 = em.createQuery("SELECT c FROM Person c");
		//personList = em.find(Person.class);
		personList = q1.getResultList();
		return personList;
	}
	
	@POST
	@Path("/person/1")
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public void addPerson(Person person) {
        em.persist(person);
		System.out.println("Persoon toegevoegd met voornaam:  " + person.getFirstName() + " en achternaam:  " + person.getLastName());
	}
	
	@POST
	@Path("/item")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public Item addItem(Item item) {
        em.persist(item);
		System.out.println("Item toegevoegd met titel:  " + item.getTitel());
		return item;
	}
}