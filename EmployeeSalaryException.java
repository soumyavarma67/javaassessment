import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class EmployeeSalaryException {
	public void employee(double salary) throws EmployeeException{
		if(salary<3000){
			throw new EmployeeException("The salary of the person cannot be less than 3000");
		}
		System.out.println("The Salary Of the Employee:"+salary);
	}
	public static void main(String args[]){
		EmployeeSalaryException ob=new EmployeeSalaryException();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of the Employee:");
		double sal=sc.nextDouble();
		try{
			ob.employee(sal);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
