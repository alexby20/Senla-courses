package task2;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.math.BigInteger;

	
	public class Main {

	    public static void main(String[] args) {
	        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
	        boolean isInputValid;

	        BigInteger input1 = null;
	        BigInteger input2 = null;

	        do {

	            isInputValid = true;

	            try {
	                System.out.println("Enter first integer : ");
	                input1 = new BigInteger(consoleReader.readLine());

	                System.out.println("Enter second integer : ");
	                input2 = new BigInteger(consoleReader.readLine());

  } catch (NumberFormatException e) {
	                
	                System.out.println("Error! Invalid input.");

	                isInputValid = false;
	            } catch (IOException e) {
	                System.out.println(" Error! Please restart.");
	            }

	        } while (!isInputValid);

	       
	        BigInteger gcd = input1.gcd(input2); 
	        BigInteger lcm = input1.multiply(input2).divide(gcd);

	      
	        System.out.println(String.format("Greatest Common Divisor %s", gcd.toString()));
	        System.out.println(String.format("Least Common Multiple %s", lcm.toString()));

	    }


	}

