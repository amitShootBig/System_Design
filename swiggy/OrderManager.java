package swiggy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderManager {

	public DeliveryExecutive findDeliveryBoyWithMaxWaitTime(List<DeliveryExecutive> des) {
		long maxDuration = 0;
		DeliveryExecutive finalDe = null;
		long now = System.currentTimeMillis();

		for(DeliveryExecutive de:des){
			if(!de.isBusy()){
				long duration = now - de.getLastOrderDeliveryTime().getTime();
				if(duration>maxDuration){
					maxDuration = duration;
					finalDe = de;
				}
			}
		}

		return finalDe;
	}

	public Order getOrderWithMaxDelay(List<Order> orders){

		Collections.sort(orders, new Comparator<Order>() {
			public int compare(Order m1, Order m2) {
				return m1.getOrderTime().compareTo(m2.getOrderTime());
			}
		});
		if(orders.isEmpty()){
			return null;
		}
		return orders.get(0);
	}

	public DeliveryExecutive getDeliveryBoyWithLowFirstMile(Order o,List<DeliveryExecutive> des){
		double minDist = Double.MAX_VALUE;
		double olat = o.getRestro().getLatitude();
		double olong = o.getRestro().getLongitude();

		DeliveryExecutive finalDe = null;

		for(DeliveryExecutive de : des){
			if(!de.isBusy()){
				double dist = LocationFinderUtility.getDistance(olat, de.getLatitude(), olong, de.getLongitude());
				if(dist<minDist){				
					minDist = dist;
					finalDe = de;
				}
			}
		}

		return finalDe;
	}

	public Order getOrderWithLowFirstMile(DeliveryExecutive de, List<Order> orders){
		double minDist = Double.MAX_VALUE;
		double olat = de.getLatitude();
		double olong = de.getLongitude();

		Order finalOrder = null;

		for(Order order : orders){
			if(order.getDe()==null){
				double dist = LocationFinderUtility.getDistance(olat, order.getRestro().getLatitude(), olong, order.getRestro().getLongitude());
				if(dist<minDist){				
					minDist = dist;
					finalOrder = order;
				}
			}
		}

		return finalOrder;

	}
}
