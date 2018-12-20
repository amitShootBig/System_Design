package swiggy;

import java.util.Date;

public class DeliveryExecutive {
	private int id;
	private double latitude;
	private double longitude;
	private boolean isBusy;

	private Date lastOrderDeliveryTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public Date getLastOrderDeliveryTime() {
		return lastOrderDeliveryTime;
	}
	public void setLastOrderDeliveryTime(Date lastOrderDeliveryTime) {
		this.lastOrderDeliveryTime = lastOrderDeliveryTime;
	}
	public boolean isBusy() {
		return isBusy;
	}
	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}

}
