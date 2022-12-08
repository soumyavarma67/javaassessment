import java.util.Scanner;

public class EmployeeNameValidation {
	public  void validateName(String firstname,String lastName) throws NameUserDefinedException{
		if(firstname.isEmpty()&&lastName.isEmpty()){
			throw new NameUserDefinedException("FirstName and Lastname cannot be Empty");
		}
		else if(lastName.isEmpty()){
			throw new NameUserDefinedException("LastName cannot be Empty");
			
		}
		else if(firstname.isEmpty()){
			throw new NameUserDefinedException("FirstName cannot be empty");
		}

		System.out.println("Welcome "+firstname+" "+lastName);
	}
	public static void main(String args[]){
		EmployeeNameValidation ob=new EmployeeNameValidation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your FirstName:");
		String fn=sc.nextLine();
		System.out.println("Enter your LastName:");
		String ln=sc.nextLine();
		sc.close();
		try{
			ob.validateName(fn,ln);
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
	}

}
