package operators;
//Write a program to add 8 to the number 2345 and then   divide it by 3.
//Now, the modulus of the quotient is taken with 5 and 
//then multiply the resultant value   by 5.
//Display the final result.

public class Add {
	public static void main(String[] args) {
		int a=2345;
		System.out.println("=+: " +(a+=8));	
		System.out.println("/3: " +(a/=3));
		System.out.println("%5: "+(a%=5));
		System.out.println("*5: "+(a*=5));
		System.out.println("final result"+a);
		
		// TODO Auto-generated method stub

	}

}
