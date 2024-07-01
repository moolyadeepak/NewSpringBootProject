package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Prouct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Prodid;
	String Prodname;
	int Price;
	
	
	
	public Prouct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prouct(String prodname, int price) {
		super();
		Prodname = prodname;
		Price = price;
	}
	public Prouct(int prodid, String prodname, int price) {
		super();
		Prodid = prodid;
		Prodname = prodname;
		Price = price;
	}
	public int getProdid() {
		return Prodid;
	}
	public void setProdid(int prodid) {
		Prodid = prodid;
	}
	public String getProdname() {
		return Prodname;
	}
	public void setProdname(String prodname) {
		Prodname = prodname;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Prouct [Prodid=" + Prodid + ", Prodname=" + Prodname + ", Price=" + Price + "]";
	}
	
	

}
