package swiggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public class MaxUtilAutoAssign extends SwiggyAutoAssigner {

	@Override
	protected void autoAssign(List<DeliveryExecutive> dEs, Queue<Order> orders) {
		
boolean allOrdersDone = false;
		while(!allOrdersDone){
			DeliveryExecutive de  = om.findDeliveryBoyWithMaxWaitTime(dEs);
			ArrayList<Order> orderlist = new ArrayList<Order>(orders);
			if(de==null){
				System.out.println("no Delivery Boy available");
				break;
			}
			else{
				Order order = om.getOrderWithLowFirstMile(de, orderlist);
				ConcurrentHashMap c = new ConcurrentHashMap<>();
				if(order!=null){
					de.setBusy(true);
					orders.remove(order);
					order.setDe(de);
					Assignment assign = new Assignment();
					assign.setDe_id(de.getId());
					assign.setOrderId(order.getOrderId());
					System.out.println(assign.toString());
				}
				else{
					allOrdersDone = true;
					System.out.println("All orders done");
				}
			}
		}
		
	}
}
