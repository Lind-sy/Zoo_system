
import java.util.ArrayList;


public class Shop {
	private boolean statuss = false;
	public ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	// buy ticket if u dont have
	public void buyTicket(double price, String date,String type,int discount,String voucher) {
		checkTicket(date,type);
		Visitor v = new Visitor(); 
		if(v.ticketStatuss == false && statuss == false) {
			System.out.println("Buying ticket\n");
		
		// ticket builder
		Ticket ticket = new Ticket.Builder()
				.withPrice(price)
				.withDate(date)
				.withType(type)
				.withDiscount(discount)
				.withVoucher(voucher)
				.build();
		
			System.out.println(v.name+" :=>> Got ticket: Price = "+price+" & date: "+date+" & Type: "+type+" & Discount: "+discount+" & voucher: "+voucher);
		
		} else if(v.ticketStatuss != false && statuss != false) {
			System.out.println("ticket\n");
		}
	}
	
	public boolean checkTicket(String date, String type) {
		for(Ticket ticket : tickets)
	    if(ticket.equals(date) && ticket.equals(type)) {
	    	this.statuss = true;
	    	return statuss;
	    } else {
	    	this.statuss = true;
	    	return statuss;
	    }
		return true;
	}
	
}
