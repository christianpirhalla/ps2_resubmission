package quiz2_2;


import java.util.Scanner;


public class TuitionCalculator {

	public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("What is the annual cost of tuition?");
		double tuitionAnnual = input.nextDouble();
		
		System.out.println("What is the rate of tuition increase?");
		double tuitionIncrease = input.nextDouble();
		
		System.out.println("What is the repayment APR?");
		double repaymentAPR = input.nextDouble();
		
		System.out.println("Over how many months would you like to pay your student loans?");
		double repaymentTerms = input.nextDouble();
		
		double rollingCost = tuitionAnnual;
		double totalCost = 0; 
		
		for (int i = 0; i < 4; i++){
			
			totalCost = (totalCost + (rollingCost * (tuitionIncrease + 1.0))) * (repaymentAPR + 1.0);
			rollingCost = rollingCost * (1 + tuitionIncrease);
			System.out.println("rolling cost" + rollingCost + " // " + totalCost);
		}
		
		System.out.println("Your degree will cost you a total of: $" + (totalCost));
		System.out.println("You will be paying $" + (totalCost/repaymentTerms) + " at "
				+repaymentTerms + " months.");
				
			
		
		
	}
	
	
}
