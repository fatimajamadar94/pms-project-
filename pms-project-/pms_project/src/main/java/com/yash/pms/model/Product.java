package com.yash.pms.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMesUnit() {
		return mesUnit;
	}
	public void setMesUnit(String mesUnit) {
		this.mesUnit = mesUnit;
	}
	public Date getMfdate() {
		return mfdate;
	}
	public void setMfdate(Date mfdate) {
		this.mfdate = mfdate;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private String  pname;
	private String mesUnit;
	private Date mfdate;
	private Date expdate;
	private int quantity;
	private float price;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", mesUnit=" + mesUnit + ", mfdate=" + mfdate + ", expdate="
				+ expdate + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
		

}
