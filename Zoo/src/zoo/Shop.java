package zoo;

/**
 * 
 * @author Martins Buhanovskis
 *
 *		Shop:
*			* visitor buys ticket
*			* checks visitors ticket
 */

public class Shop {
	
	Visitor visitor = new Visitor();
	AnimalZone  zone = new AnimalZone();
	HumanStatus human = new HumanStatus();
	Discounts discount = new Discounts();
	Ticket ticket = new Ticket();

	/**
	 * Checks if ticket have specific date and type
	 * 
	 * @param date
	 * @param type
	 * @return true | false
	 */
	public boolean checkTicket(String date, String type) {
	        
        for (Ticket ticket : this.ticket.getTickets()) { 
            if(ticket.getDate().equals(date) && ticket.getType().equals(type)){
                return true;
            }
        }
        return false;
	}
	/*
	public void giveTicket(String type,String date,double price,String discount2,String code,String humanStatus2) {
	    Ticket ticket = new Ticket(type, date, price, discount2, code, humanStatus2);
	    
	    this.ticket.addTicket(ticket);
	}*/
	/**
	 * Buys new ticket.
	 * 
	 * @param price
	 * @param date
	 * @param type
	 * @param discount
	 * @param humanStatus
	 * @param code
	 * @param status
	 */
	public void buyTicket(double price, String date,String type,String discount,String humanStatus,String code,boolean status) {
		System.out.println("\nBuying ticket\n");
		
		if( status == false  && checkTicket(date, type) == false) {
			
	// Ticket Builder - creates new ticket with specific data
			new Ticket.Builder()
					.withPrice(price)
					.withDate(date)
					.withAnimalZoneType(zone.setZoneName(type))
					.withDiscount(this.discount.fromNameToValue(discount))
					.withHumanStatus(human.setHumanStatus(humanStatus))
					.build();
		}
		else {
			
		}
		
	}
	
}
