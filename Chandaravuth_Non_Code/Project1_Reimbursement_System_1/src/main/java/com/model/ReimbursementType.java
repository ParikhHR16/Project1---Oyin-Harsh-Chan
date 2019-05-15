package com.model;

public class ReimbursementType {
	private int id_type;
	private String lodging;
	private String food;
	private double amounts;
	private String description;
	private String other;
	
	
	public ReimbursementType() {
		// TODO Auto-generated constructor stub
	}
	
	


	public ReimbursementType(int id_type, String lodging, String food, double amounts, String description,
			String other) {
		super();
		this.id_type = id_type;
		this.lodging = lodging;
		this.food = food;
		this.amounts = amounts;
		this.description = description;
		this.other = other;
	}




	public int getId_type() {
		return id_type;
	}


	public void setId_type(int id_type) {
		this.id_type = id_type;
	}


	public String getLodging() {
		return lodging;
	}


	public void setLodging(String lodging) {
		this.lodging = lodging;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	public double getAmounts() {
		return amounts;
	}


	public void setAmounts(double amounts) {
		this.amounts = amounts;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getOther() {
		return other;
	}


	public void setOther(String other) {
		this.other = other;
	}


	@Override
	public String toString() {
		return "ReimbursementType [id_type=" + id_type + ", lodging=" + lodging + ", food=" + food + ", amounts="
				+ amounts + ", description=" + description + ", other=" + other + "]";
	}
	
	
	

}
