package training;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int temp=0;
		int sum=0;
		
		while(num>0){
			
			temp=num;
			int rem1=temp%10;
			sum=sum+rem1;
			num=temp/10;
			
			
			
					
		}
		System.out.println("sum of digits:"+sum);
		
	}
	UniqueChar un=new UniqueChar();
	//System.out.println(un.charcount("soumyavarma"));
	//(res);
}
