package employee2;

public class DemoEmployee2 {
public static void main(String args[])
{
	employee emp1=new employee(4234,"Vijay",44000);
	System.out.println(" Employee Details\n----------------------------------------\n ID   NAME   BASIC SALARY  ALLOWANCE");
	
	emp1.calNetSalary();
	employee emp2=new employee(4244,"Santosh",24000);
	emp2.calNetSalary();
}
}
