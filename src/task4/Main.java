package task4;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	
	public class Main {
	    public static void main(String[] args) {
	        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
	        String input = "";
	        String wordToSearch = "";

	        try {
	            System.out.println("Enter the text: ");
	            input = consoleReader.readLine();
	            System.out.println("Enter the word: ");
	            wordToSearch = consoleReader.readLine();

	        } catch (IOException e) {
	            System.out.println("Error! Please restart");
	        }

	      
	        int counter = 0;

	        Pattern pattern = Pattern.compile("\\b" + wordToSearch.toLowerCase() + "\\b");
	        Matcher matcher = pattern.matcher(input.toLowerCase());
	        while (matcher.find()) {
	            counter++;
	        }

	        System.out.printf("The word occurs in the text %s  %d times ",wordToSearch, counter);
	    }
	}

