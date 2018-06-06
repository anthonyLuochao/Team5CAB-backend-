package controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Model.Booking;
import Model.Facility;
import Model.FacilityType;
import Model.Users;
import facilityDAO.Search;
import util.PersistenceManager;

public class Test {

	public static void main(String[] args) {
		Search a=new Search();
		
		FacilityType ft =new FacilityType();
		Facility f =new Facility();
		Booking b =new Booking();
		Users u=new Users();
		
		a.output(u);

		
		
		

	}

}
