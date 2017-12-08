package zoo;

public class Zoo {
/**
* 
* @author Martins Buhanovskis
*
*/
	
	public static void main(String[] args) {
		Shop shop = new Shop();
		
		Visitor visit = new Visitor("janis",true);
		visit.zooTicket(5.00, "20-10-2017", "General", "10%", "adult", "JS33SS8SK3");
		System.out.println("Ticket Status First: "+shop.checkTicket("20-10-2017","General"));
		System.out.println("\n-----------------------------------------------\n");
	
		Visitor visit2 = new Visitor("juris",true);
		visit2.zooTicket(5.00, "21-10-2017", "General", "15%", "Senior", null);
		System.out.println("Ticket Status Secound: "+shop.checkTicket("21-10-2017","General"));
		System.out.println("\n-----------------------------------------------\n");
		
		Visitor visit3 = new Visitor("Peteris",false);
		visit3.zooTicket(15.00, "23-10-2017", "General", "20%", "Children", null);
		System.out.println("Ticket Status Third: "+shop.checkTicket("23-10-2017","General"));

	}	
}
