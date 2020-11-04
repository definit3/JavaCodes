package hsbc.customer;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	public Address(String building, String street, String city) {
		super();
		this.building = building;
		this.street = street;
		this.city = city;
	}
	private String building="this building";
	private String street="that street";
	private String city="this city";
	
	public Address()
	{
	}
	
	@Override
	public String toString() {
		return "Address [building=" + building + ", street=" + street + ", city=" + city + "]";
	}

	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
