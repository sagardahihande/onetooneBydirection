package onetooneBydirection.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int personid;
	private String name;
	private String address;
	@OneToOne
	private Pancard pancard;
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
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
	public Pancard getPancard() {
		return pancard;
	}
	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", name=" + name + ", address=" + address + ", pancard=" + pancard
				+ "]";
	}
	
	
	

}
