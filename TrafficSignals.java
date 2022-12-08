import java.util.Scanner;

public class TrafficSignals {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color of signal:");
		String color=sc.nextLine();
		String colorr=color.toLowerCase();
		switch(colorr){
		case "red":
			 System.out.println("STOP");
			 break;
		case "yellow":
			System.out.println("GET READY");
			break;
		case "green":
			System.out.println("GO");
			break;
		default:
			System.out.println("Please enter a valid color");
		}
		
	}

}
