package swiggy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locality locality = new Locality();
		locality.setPincode(560102);
	
  		ArrayList<DeliveryExecutive> listOfDEs =  (ArrayList<DeliveryExecutive>) locality.getListOfDEs();
  		ArrayList<Restaurant> listOfRestros = (ArrayList<Restaurant>) locality.getListOfRestros();
  		Queue <Order> orders = new LinkedList<Order>();
 
  		listOfDEs.add(addDeliverBoy("09:39:14.000Z",567, 12.917540, 77.610050));	
  		listOfDEs.add(addDeliverBoy("09:25:14.000Z", 765, 12.915620, 77.610050));
  		//listOfDEs.add(addDeliverBoy("09:28:14.000Z", 765, 12.913620, 77.610050));
  		locality.setListOfDEs(listOfDEs);
  		
  		listOfRestros.add(addRestaurant("A", 12.917640, 77.610050));
  		listOfRestros.add(addRestaurant("B", 12.913640, 77.610050));
  		listOfRestros.add(addRestaurant("C", 12.917640, 77.610050));
  		
  		//locality.setListOfRestros(null);
  		locality.setServicable(true);
  		
  		orders.add(addOrder(123, "09:55:14.000Z", listOfRestros.get(0)));
  		orders.add(addOrder(321, "09:57:14.000Z", listOfRestros.get(1)));
  		orders.add(addOrder(512, "09:57:14.000Z", listOfRestros.get(2)));
  		SwiggyAutoAssigner autoAssigner = new SwiggyAutoAssigner();
  		autoAssigner.autoAssign(listOfDEs, orders);
  		//MaxUtilAutoAssign maxUtilAutoAssigner = new MaxUtilAutoAssign();
  		//maxUtilAutoAssigner.autoAssign(listOfDEs, orders);
	}
	

	
	static Order addOrder(int id, String time,Restaurant restro){
		Order o = new Order();
  		o.setOrderId(id);
  		o.setOrderTime(getTime(time));
  		o.setRestro(restro);
  		return o;
	}
	
	static DeliveryExecutive addDeliverBoy(String time, int id, double latitude, double longitude) throws ParseException{
		
		DeliveryExecutive de = new DeliveryExecutive();
		de.setId(id);
		de.setLatitude(latitude);
		de.setLongitude(longitude);
		de.setLastOrderDeliveryTime(getTime(time));
		return de;
	}
	
	static Restaurant addRestaurant(String name, double latitude, double longitude){
		Restaurant restro = new Restaurant();
		restro.setName(name);
		restro.setLatitude(latitude);
		restro.setLongitude(longitude);
		return restro;
		
	}
	
	static Date getTime(String time){
		String time1 = time.substring(time.indexOf("T") + 1, time.indexOf(".0"));
        Date date = null;
		try {
			date = new java.text.SimpleDateFormat("HH:mm").parse(time1);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        return date;
	}

}
