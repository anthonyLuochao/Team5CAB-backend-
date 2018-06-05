package controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Model.FacilityType;
import util.PersistenceManager;

public class Test {

	public static void main(String[] args) {
		EntityManager em=PersistenceManager.INSTANCE.getEntityManager();
		Query query=em.createQuery("From FacilityType");
		ArrayList<FacilityType> result=(ArrayList<FacilityType>)query.getResultList();
		for(FacilityType ft:result)
		{
			System.out.println(ft);
		}
		

	}

}
