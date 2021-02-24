package calculator;
import java.lang.Math;
public class magicCalculator extends calculator{
	public magicCalculator() {
		
	}
	public static double calcSquareRoot(int num) {
		return Math.sqrt(num);
	}
	public static double findSin(double num) {
		return Math.sin(num);
	}
	public static double findCosine(double num) {
		return Math.cos(num);
	}
	public static double findTanget(double num) {
		return Math.tan(num);
	}
	public static int findFactorial(int n) {
		if (n == 0)    
			return 1;    
		else    
			return(n * findFactorial(n-1));    
	} 
}
