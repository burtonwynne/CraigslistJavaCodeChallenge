import java.math.BigInteger;

public class FactorialExample {
	
	
	/**
	 * Based on 
	 * https://en.wikipedia.org/wiki/Factorial
	 * @param x
	 * @return
	 */
	public BigInteger factorial(int x){
		BigInteger factorial = new BigInteger("1");
		if(x < 0){
			throw new NumberFormatException("You entered the value of: " + 
		x + 
		".  You must enter a positive interger. ;");
		}else if( x > 1){
			for(int index = x; index >= 2L; index--){
				factorial = factorial.multiply(new BigInteger(Integer.toString(index)));
				
				//System.out.println("\tindex: " + index + " factorial: " + 
				//factorial );
			}
		}
		return factorial;
		
	}
	
	public static void main(String[] args) {
		FactorialExample fe = new FactorialExample();
		System.out.println("10! = " + fe.factorial(10));
		System.out.println("17! = " + fe.factorial(17));
		System.out.println("5! = " + fe.factorial(5));
		System.out.println("2! = " + fe.factorial(2));
		System.out.println("1! = " + fe.factorial(1));
		System.out.println("0! = " + fe.factorial(0));
		System.out.println("100! = " + fe.factorial(100));
		try{
			System.out.println("-10! = " + fe.factorial(-10));
		}catch(NumberFormatException ne){
			System.out.println("Exception caught: " + ne.getMessage());
		}
	}

}
