//package facilityDAO;
//
//import java.util.ArrayList;
//import Model.Facility;
//import util.PersistenceManager;
//
//import javax.persistence.*;
//public class FacilitySearch {
//	public ArrayList<Facility> searchFacility(Facility facility)
//	{
//		EntityManager em=PersistenceManager.INSTANCE.getEntityManager();
//		Query query=em.createQuery("from facility");
//		@SuppressWarnings("unchecked")
//		ArrayList<Facility> result=(ArrayList<Facility>)query.getResultList();
//		return result;
//	}
//
//}
