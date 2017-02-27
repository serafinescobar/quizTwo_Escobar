//Serafin Escobar

package tuitionCalc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calcTotal {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double initTuition;
		double tuition;
		double totalCost = 0.0;
		double percentageIncr;
		DecimalFormat decimalF = new DecimalFormat("#.00");
		
		System.out.println("Please enter the initial tution cost: ");
		initTuition = input.nextDouble();
		
		System.out.println("Please enter the percentage increase(in percent form such as 3.4): ");
		percentageIncr = input.nextDouble();	
		
		tuition = initTuition;
		
		
		for(int i = 0; i < 3; i = i +1)
		{
			
			initTuition = initTuition + increaseYear(initTuition,percentageIncr);
			totalCost = totalCost + initTuition;
		}
		String tCost = decimalF.format(totalCost);
		System.out.println(tCost);
		
	}
	public static double increaseYear(double a, double b)
	{
		return((a*b)/100);
		
	}
}
