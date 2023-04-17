package onetooneBydirection.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
	
	@Id
	private int pancardid;
	private String name;
	private String address;
	@OneToOne
	private Person person;
	public int getPancardid() {
		return pancardid;
	}
	public void setPancardid(int pancardid) {
		this.pancardid = pancardid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Pancard [pancardid=" + pancardid + ", name=" + name + ", address=" + address + ", person=" + person
				+ "]";
	}
	
	
	
	

}
