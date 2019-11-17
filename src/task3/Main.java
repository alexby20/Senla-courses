package task3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{

    public static void main(String []args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sentence:");
        String text = null;
        try {
            text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error! Please restart.");
        }
        String []array = text.split(" ");
        System.out.println("Number of words in a sentence: "+array.length);
        
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].substring(0,1).toUpperCase()+array[i].substring(1);
            
            System.out.print(array[i]+" ");
           
        }
        
        
        System.out.println();
        ArrayList<String> words= new ArrayList<>();
        Collections.addAll(words, array);
        Collections.sort(words);
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}