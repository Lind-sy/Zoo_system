
public class Zoo {

	public static void main(String[] args) {
		
		Visitor visit = new Visitor("janis",false);
		visit.getTicket(5.00, "20-10-2017", "General", 10, "adult");
		
		System.out.println("\n-----------------------------------------------\n");
		
		Visitor visit2 = new Visitor("juris",true);
		visit2.getTicket(5.00, "20-10-2017", "General", 15, "Senior");

		System.out.println("\n-----------------------------------------------\n");
		
		Visitor visit3 = new Visitor("Peteris",false);
		visit3.getTicket(15.00, "20-10-2017", "General", 20, "Children");
	}
}
