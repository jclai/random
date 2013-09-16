//CSE464 Homework 1: Modified Triange.java by Justin Lai

import java.math.BigDecimal;

public class Triangle {
	
	//Changed input parameters to be doubles to accommodate case of right isosceles triangles
	public static String Triangle_Test(double a, double b, double c)
	{
		final int MIN = 1;
		final int MAX = 200;

		if(a < MIN || a > MAX)
			return "value of a is out of range"; 
		if(b < MIN || b > MAX)
			return "value of b is out of range"; 
		if(c < MIN || c > MAX)
			return "value of c is out of range"; 

		if(a < b+c && b < a+c && c < a+b) { // if triangle
			//Calculate truncated Pythagorean  sum to check for right triangles
			double leftSum = new BigDecimal(a*a + b*b).setScale(6, BigDecimal.ROUND_DOWN).doubleValue();
			System.out.print(leftSum);
			double rightSum = new BigDecimal(c*c).setScale(6, BigDecimal.ROUND_DOWN).doubleValue();
			System.out.println(" " + rightSum);
			if(a == b && b == c)
				return "Equilateral (not right)";
			else if(a != b && a != c && b != c)
			{
				if(leftSum == rightSum)
					return "Right Scalene";
				else
					return "Scalene (not right)";
			}
			else
			{
				if(leftSum == rightSum)
					return "Right Isosceles";
				else
					return "Isosceles (not right)";
			}
		} else
			    return "Not a triangle";
			
			
	}
	

}