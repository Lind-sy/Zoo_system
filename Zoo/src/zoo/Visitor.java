package zoo;
/**
 * 
 * @author Martins Buhanovskis
 * 
 * Visitor class. 
 * 
 * 		Visitor:
 * 				* gets or gives ticket
 * 				* gives ticket
 *
 */
public class Visitor{
	
	private String name ="";
	private boolean ticketStatuss;
	Ticket ticket = new Ticket();
	
	
	public Visitor() {	
	}
	
	public Visitor(String name, boolean ticketStatuss) {
		//this.name = name;
		//this.ticketStatuss = ticketStatuss;
		setName(name);
		setHaveTicket(ticketStatuss);
		
	}
	public String getName() {
		return name;
	}
	public boolean getTicketStatus() {
		return ticketStatuss;
	}
	 
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setHaveTicket(boolean ticketStatus) {
		this.ticketStatuss = ticketStatus;
	}
	
	/**
	 * gives or gets new ticket with parameters as follows:
	 * 
	 * @param price
	 * @param date
	 * @param type
	 * @param discount
	 * @param humanStatus
	 * @param code
	 */
	public void zooTicket(double price, String date,String type,String discount,String humanStatus,String code)  {
		if(this.ticketStatuss == true) {
			//Shop shop = new Shop();
		
			//ticket.addTicket(type, date, price, discount, code, humanStatus);
			//addTicket(ticket.type, date, price, discount, code, humanStatus);
			//shop.giveTicket(type, date, price, discount, code, humanStatus);
			giveTicket(type, date, price, discount, code, humanStatus);

		} else {
			getTicket(price, date, type, discount, humanStatus, code);
		}
	}
	
	
	/**
	 * Gets new ticket from shop
	 * 
	 * @param price
	 * @param date
	 * @param type
	 * @param discount
	 * @param humanStatus
	 * @param code
	 */
	public void getTicket(double price, String date,String type,String discount,String humanStatus,String code) {
		Shop sh = new Shop();
		sh.buyTicket(price,date,type,discount,humanStatus,code,ticketStatuss);
	}
/**
 * Gives ticket and adds to ticket list
 * 
 * @param type
 * @param date
 * @param price
 * @param discount
 * @param code
 * @param humanStatus
 */
    public void giveTicket(String type,String date,double price,String discount,String code,String humanStatus) {
        //Ticket ticket = new Ticket(type, date, price, discount, code, humanStatus);
        //ticket.addTicket(ticket);
    	Ticket ticket = new Ticket(type, date, price, discount, code, humanStatus);
 	    this.ticket.addTicket(ticket);
    }
}
