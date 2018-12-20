package swiggy;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class SwiggyAutoAssigner {

	protected List<DeliveryExecutive> dEs = new ArrayList<>();
	OrderManager om = new OrderManager();
	
	protected void autoAssign(List<DeliveryExecutive> dEs,Queue<Order> orders){
		while (orders.peek() != null){
			Order order = orders.remove();
			DeliveryExecutive de = om.getDeliveryBoyWithLowFirstMile(order, dEs);
			if(de==null){
				System.out.println("No delivery boy availble currently");
				break;
			}
			de.setBusy(true);
			order.setDe(de);
			Assignment assign = new Assignment();
			assign.setDe_id(de.getId());
			assign.setOrderId(order.getOrderId());
			System.out.println(assign.toString()+ "\n");
		}
	
	}
	
}
