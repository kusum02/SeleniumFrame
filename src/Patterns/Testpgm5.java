package Patterns;

public class Testpgm5 {

	public static void main(String[] args) {
				int n=4;
		       
				
		       String binary = "";
		       while (n > 0) {
		           int rem = n % 2;
		           binary = rem + binary;
		           n = n / 2;
		       }
		      System.out.println(binary);
		   }

	}


