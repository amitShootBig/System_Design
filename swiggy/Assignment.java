package swiggy;

public class Assignment {

	private long orderId ;
	private int de_id;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public int getDe_id() {
		return de_id;
	}
	public void setDe_id(int de_id) {
		this.de_id = de_id;
	}
	
	@Override
	public String toString() {
		return "Assignment [orderId=" + orderId + ", de_id=" + de_id + "]";
	}

	
}
