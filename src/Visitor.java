
public class Visitor {
	
	public String name ="";
	public boolean ticketStatuss;
	
	Shop shoping = new Shop();
	
	public Visitor() {	
	}
	
	public Visitor(String name, boolean ticketStatuss) {
		this.name = name;
		this.ticketStatuss = ticketStatuss;
		
	}
	// visitor gets ticket
	public void getTicket(double price, String date,String type,int discount,String voucher) {
		Shop sh = new Shop();
		sh.buyTicket(price,date,type,discount,voucher);
	}
	
	
}
