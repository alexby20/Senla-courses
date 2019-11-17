package task1;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.math.BigInteger;

	public class Main {

	    public static void main(String[] args)  {
	        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
	        boolean isInputValid;
	        String primeProp = "";
	        String evenProp = "";
	        BigInteger input = null;

	        do {
	            System.out.println("Enter an integer: ");

	             isInputValid = true;

	            try {
	                 input = new BigInteger(consoleReader.readLine());

	            } catch (NumberFormatException e) {

	                System.out.println(String.format("Error! Invalid input.",
	                        Long.MIN_VALUE * 1.0, Long.MAX_VALUE * 1.0));

	                isInputValid = false;
	            } catch (IOException e) {
	                System.out.println("Error! Please restart.");
	            }

	        } while (!isInputValid);

	       
	        if (input.compareTo(BigInteger.valueOf(1)) == 1) {
	            primeProp = isPrime(input) ? "prime" : "composite";
	        } else {
	            primeProp = (input.compareTo(BigInteger.ZERO) == -1) ? " negative " : "nor prime, nor composite";
	        }

	        evenProp = isEven(input) ? "even" : "odd";

	        System.out.println(String.format("Number %,d - %s and %s", input, evenProp, primeProp));
	    }



	    public static boolean isPrime(BigInteger val) {
	        BigInteger sqrtVal = sqrt(val);
	        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(sqrtVal) == -1; i = i.add(BigInteger.ONE)) {
	            if (val.remainder(i) == BigInteger.ZERO) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static boolean isEven(BigInteger val) {
	        return val.remainder(BigInteger.valueOf(2)) == BigInteger.ZERO;
	    }


	    public static BigInteger sqrt(BigInteger N)
	    {
	        final BigInteger TWO = BigInteger.valueOf(2);

	        BigInteger result = N.divide(TWO);
	        while(result.multiply(result).subtract(N).compareTo(BigInteger.ONE.divide(new BigInteger("100000000")))==1) {
	            result = result.add(N.divide(result)).divide(TWO);
	        }
	        return result;
	    }
	}

