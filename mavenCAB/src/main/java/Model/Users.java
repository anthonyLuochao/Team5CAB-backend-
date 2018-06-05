package Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.Set;
import Model.Booking;
import java.util.Collection;
import java.util.List;
@Entity
@Table(name="users")
public class Users {
@Id
private String userID;	
@OneToMany(mappedBy="users")
private List<Booking> bookings;

private String name;
private String email;
private String address;
@Column(name="phonenumber")
private int phoneNumber;
private Date dob; 
private String membershipID;
private String role;
private String password;
public String getUserID() {
	return userID;
}

public void setUserID(String userID) {
	this.userID = userID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getMembershipID() {
	return membershipID;
}
public void setMembershipID(String membershipID) {
	this.membershipID = membershipID;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
