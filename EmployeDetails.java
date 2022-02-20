package weeek1.day4;

public class EmployeDetails {
	public void printEmployeeName(String empname,int empId)
	{
		System.out.println(empname);
		System.out.println(empId);
	
	}
	public void getEmployeeAddress(String empAddress)
	{
		System.out.println(empAddress);
	}
	public void employeeSalary(double empsalary)
	{
		System.out.println(empsalary);
	}
	
	public void employeeMobilenumber(long mobNumber)
	{
		System.out.println(mobNumber);
	}
	

	public static void main(String[] args) {
		EmployeDetails  emp=new EmployeDetails();
		emp.printEmployeeName("Hema",1407);
		emp.getEmployeeAddress("chennai");
		emp.employeeSalary(30000.65);
		emp.employeeMobilenumber(124566788765345l);

	}

}
