package employee;

public class Customer {
	private int iCustID;
	 private String sCustName;
	 private String sAddress;
	 private long lTeleNo;
	 public Customer(int iCustID, String sCustName, String sAddress, long lTeleNo) {
		super();
		this.iCustID = iCustID;
		this.sCustName = sCustName;
		this.sAddress = sAddress;
		this.lTeleNo = lTeleNo;
	}

	boolean validateTeleNo()
	 {
		 if(this.lTeleNo==10)
			 return true;
		 else
			 return false;
	 }
	 boolean validateCustName()
	 {
		if(this.sCustName.length()>4&&20<this.sCustName.length()) 
		 return true;
		 else
			 return false;
	 }
	 void displayDetails()
	 {System.out.println("     Customer detail's\n----------------------------------");
		System.out.println("Customer ID : "+this.iCustID+"\nCustomer Name : "+this.sCustName+"\nCustomer Address :  "+this.sAddress+"\nTele phone no :  "+this.lTeleNo); 
	 }

}
