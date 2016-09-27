package employee;

//import java.util.*;

public class itemDetails {
	private int[] iItemID = { 1001, 1002, 1003, 1004, 1005 };
	private double[] dItemPrice = { 1000, 500, 40.90, 200.22, 100.10 };
	int chi[] = { 1001, 1003, 1004, 1005, 1006 };
	double Price = 0;
	// Scanner in = new Scanner(System.in);

	// @SuppressWarnings("unused")
	double validateItemID(int Q) {
		for (int i = 0; i < Q; i++) {
			for (int j = 0; j < 5; j++)
				if (this.iItemID[i] == chi[j])
					Price = Price + this.dItemPrice[i];
		}
		return Price;

	}

	void display(int Q) {
		System.out.println("\n  ITEM DETAIL'S ARE \n---------------------");

		for (int i = 0; i < Q; i++) {
			for (int j = 0; j < 5; j++)
				if (this.iItemID[i] == chi[j]){
					System.out.println("ITEM ID : " + chi[i]);
			System.out.println("ITEM PRICE : " + this.dItemPrice[i]);}

		}
	}

	public itemDetails() {
		super();
		this.iItemID = iItemID;
		this.dItemPrice = dItemPrice;
	}

}
