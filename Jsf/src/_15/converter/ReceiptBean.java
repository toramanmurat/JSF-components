package _15.converter;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ReceiptBean {
	
	private double amunt;
	private Date date;
	
	
	public double getAmunt() {
		return amunt;
	}
	public void setAmunt(double amunt) {
		this.amunt = amunt;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
