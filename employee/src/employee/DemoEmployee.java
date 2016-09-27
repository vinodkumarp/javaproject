package employee;

public class DemoEmployee {

	public static void main(String[] args) {
		int Q=4;
		Customer c1=new Customer(212,"VIJAY","viday nagar,hubli",8494953315L);
		c1.validateTeleNo();
		c1.validateCustName();
		c1.displayDetails();
		itemDetails item=new itemDetails();
		double amt=item.validateItemID(Q);
		item.display(Q);
		purchaseBill pb=new purchaseBill(212,Q,amt);
		pb.calculateBill();
		pb.display();		
		
	}

}
