package employee2;

public class employee {
	int iEmpID;
	String sEmpName;
	float fEmpBasicSalary, fAllowance;

	public employee(int iEmpID, String sEmpName, float fEmpBasicSalary) {
		this.iEmpID = iEmpID;
		this.sEmpName = sEmpName;
		this.fEmpBasicSalary = fEmpBasicSalary;
	}

	void calNetSalary() {
		if (this.fEmpBasicSalary == 5000)
			this.fEmpBasicSalary = this.fEmpBasicSalary - this.fEmpBasicSalary / 5;
		else if (this.fEmpBasicSalary >= 5001 && this.fEmpBasicSalary <= 10000)
			this.fEmpBasicSalary = this.fEmpBasicSalary - this.fEmpBasicSalary / 10;
		else if (this.fEmpBasicSalary >= 10001 && this.fEmpBasicSalary <= 20000)
			this.fEmpBasicSalary = this.fEmpBasicSalary - this.fEmpBasicSalary / 20;
		else if (this.fEmpBasicSalary >= 20000)
			this.fEmpBasicSalary = this.fEmpBasicSalary - this.fEmpBasicSalary / 30;
		else
			;

		this.fAllowance = this.fEmpBasicSalary / (46);
		System.out.println(iEmpID + "  " + sEmpName + "   " + fEmpBasicSalary + "    " + fAllowance);
	}
}