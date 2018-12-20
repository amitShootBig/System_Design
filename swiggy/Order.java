package swiggy;

import java.util.Date;

public class Order {

	private long orderId;
	private Restaurant restro;
	private Date orderTime;
	private DeliveryExecutive de=null;
	private Locality locality=null;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Restaurant getRestro() {
		return restro;
	}
	public void setRestro(Restaurant restro) {
		this.restro = restro;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public DeliveryExecutive getDe() {
		return de;
	}
	public void setDe(DeliveryExecutive de) {
		this.de = de;
	}
	public Locality getLocality() {
		return locality;
	}
	public void setLocality(Locality locality) {
		this.locality = locality;
	}
	
}
