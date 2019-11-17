package task5;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	
	public class Main {
	    public static void main(String[] args) {
	        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
	        boolean isInputValid;

	        int input = 0;

	        do {
	            System.out.println("Enter the length of the sequence from 0 to 100:");
	            isInputValid = true;

	            try {

	                input = Integer.parseInt(consoleReader.readLine());

	                if (input < 0 || input > 100) {
	                    throw new InvalidInputException();
	                }

	            } catch (NumberFormatException | InvalidInputException e) {
	               
	                System.out.println(String.format("Error! The length of the sequence must be in the range from 0 to 100", Integer.MAX_VALUE * 1.0));

	                isInputValid = false;
	            } catch (IOException e) {
	                System.out.println("Error! Restart the program!");
	            }

	        } while (!isInputValid);

	        int counter = 0;

	        for (int i = 0; i < input; i++) {
	            String iStr = String.valueOf(i);
	            String iStrReverse = new StringBuilder(iStr).reverse().toString();

	            if (iStr.equals(iStrReverse)) {
	                System.out.printf("%d ",i);
	                counter++;
	            }

	        }

	        System.out.println();
	        System.out.println(String.format("Found %d numbers of palindromes",counter));


	    }

	    static class InvalidInputException extends Exception {

			
			private static final long serialVersionUID = 1L;

	    }
	}

