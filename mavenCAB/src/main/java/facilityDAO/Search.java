package facilityDAO;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Model.FacilityType;
import util.PersistenceManager;

public class Search {

public Search() {
		super();
		
	}

	public void output(Object o) {
	EntityManager em=PersistenceManager.INSTANCE.getEntityManager();
	String tableName="From "+o.getClass().getName();
	Query query=em.createQuery(tableName);
	@SuppressWarnings("unchecked")
	ArrayList<Object> result=(ArrayList<Object>)query.getResultList();
	
	for(Object ft:result)
	{
		System.out.println(ft);
	}
	}
	

}

