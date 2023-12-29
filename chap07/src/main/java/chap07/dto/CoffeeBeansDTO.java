package chap07.dto;

public class CoffeeBeansDTO {

	private Integer beans_id;
	private String bean_name;
	private String country_id;
	private String coffee_taste;
	
	
	public CoffeeBeansDTO(Integer beans_id, String bean_name, String country_id, String coffee_taste) {
		super();
		this.beans_id = beans_id;
		this.bean_name = bean_name;
		this.country_id = country_id;
		this.coffee_taste = coffee_taste;
	}
	
	public Integer getBeans_id() {
		return beans_id;
	}
	public void setBeans_id(Integer beans_id) {
		this.beans_id = beans_id;
	}
	public String getBean_name() {
		return bean_name;
	}
	public void setBean_name(String bean_name) {
		this.bean_name = bean_name;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public String getCoffee_taste() {
		return coffee_taste;
	}
	public void setCoffee_taste(String coffee_taste) {
		this.coffee_taste = coffee_taste;
	}
	
	
	
}
