package employee;

public class purchaseBill {
	private int iBillID;
	private int iQty;
	private double dBillAmt;
	void calculateBill()
	{if(iQty>0&&iQty<5)
	 {
		if(dBillAmt>=1000)
			this.dBillAmt=this.dBillAmt+this.dBillAmt*(0.1);
		else if(dBillAmt>=500)
			this.dBillAmt=this.dBillAmt+this.dBillAmt/5;
			
	}
	}public purchaseBill(int iBillID, int iQty, double dBillAmt) {
		super();
		this.iBillID = iBillID;
		this.iQty = iQty;
		this.dBillAmt = dBillAmt;
	}

	void display()
	{
		System.out.println("\n PURCHASE BILL\n----------------------------");
		System.out.println("BILL ID : "+iBillID+"\nQUANTITY : "+iQty+"\nTOTAL AMOUNT : "+dBillAmt);
	}
}
