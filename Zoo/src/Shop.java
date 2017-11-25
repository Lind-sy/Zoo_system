
import java.util.ArrayList;


public class Shop {
	private boolean statuss;
	public ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	// buy ticket if u dont have
	public void buyTicket(double price, String date,String type,int discount,String voucher) {
		statuss = checkTicket(date,type);

		if(statuss==false) {
			System.out.println("No Ticket");
		} else if(statuss==true){
			System.out.println("Have Ticket");
		}

		Visitor v = new Visitor();
		if((v.ticketStatuss == false) && (statuss == false)) {
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
		
		}else if((v.ticketStatuss == true) && (statuss == false)){

			System.out.println("Already Have valid ticket\n");
			Ticket ticket = new Ticket();
			ticket.Ticket(price,date,type,discount,voucher);
			System.out.println(v.name+" :=>> Got ticket: Price = "+price+" & date: "+date+" & Type: "+type+" & Discount: "+discount+" & voucher: "+voucher);
		}
	}
	
	public boolean checkTicket(String date, String type) {

			for(Ticket ticket : tickets)
				if (!(ticket.equals(date)) && !(ticket.equals(type))) {
					// statuss = true;
					return false;
				}//else if(!ticket.equals(date) && !ticket.equals(type)) {
				//statuss = false;
				//return false;
				//}

		return true;
		}
	
}
