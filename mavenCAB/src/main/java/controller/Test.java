package controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Model.Facility;
import Model.FacilityType;
import util.PersistenceManager;

public class Test {

	public static void main(String[] args) {
		EntityManager em=PersistenceManager.INSTANCE.getEntityManager();
		Query query=em.createQuery("From Facility");
		ArrayList<Facility> result=(ArrayList<Facility>)query.getResultList();
		for(Facility ft:result)
		{
			System.out.println(ft);
		}
		

	}

}
