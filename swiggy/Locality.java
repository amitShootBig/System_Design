package swiggy;


import java.util.ArrayList;
import java.util.List;

public class Locality {
	private int pincode;
	private List<DeliveryExecutive> listOfDEs = new ArrayList<DeliveryExecutive>();
	private List<Restaurant> listOfRestros = new ArrayList<Restaurant>();
	private boolean isServicable;
	
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<DeliveryExecutive> getListOfDEs() {
		return listOfDEs;
	}

	public void setListOfDEs(List<DeliveryExecutive> listOfDEs) {
		this.listOfDEs = listOfDEs;
	}

	public List<Restaurant> getListOfRestros() {
		return listOfRestros;
	}

	public void setListOfRestros(List<Restaurant> listOfRestros) {
		this.listOfRestros = listOfRestros;
	}

	public boolean isServicable() {
		return isServicable;
	}

	public void setServicable(boolean isServicable) {
		this.isServicable = isServicable;
	}
	
	
}
