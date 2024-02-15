//Raghav Krishna Ranganathan
//Peterson Period 5
//4/1/22

import java.util.*;
import java.io.*;

public class WordList extends ArrayList<String>
{
    private static final long serialVersionUID = -1447871553241214941L;
    private int longestWordLength = 0;
    public int[] letterCount = new int[26];
    public double[] letterRatio = new double[26];
    public int totalLetters = 0;
    
    
    public WordList(String filename, int min, int max) {

        try  {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            try
            {
            	
            	while (scanner.hasNext()) {
	                String word = scanner.next();
	                countLetter(word);
	                
	                if (word.length() >= min && word.length() <= max) {
	                	
	                	super.add(word.toUpperCase());
	                	
	                	
	                	if (word.length() > this.longestWordLength) {
	                		this.longestWordLength = word.length();
	                	}
	                }
	            }
            }
            finally {
            	scanner.close();
            }
        }
        catch (Exception e) {
        	throw new RuntimeException("Error reading word list", e);
        }
        

        System.out.println("Loaded " + this.size() + " word(s)");
        System.out.println("Longest word " + this.longestWordLength);
        Collections.sort(this);
        for (int i = this.size() - 2; i >= 0; i--) {
             if (this.get(i).equals(this.get(i + 1))) {
                 this.remove(i + 1);
             }
        }
        
        System.out.println("Random Character: " + nextLetter().toUpperCase());
    }
    public void countLetter(String word) {
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	word = word.toLowerCase();
    	
    	for(int i = 0; i < word.length(); i++) {
    		int index = alphabet.indexOf(word.charAt(i));
    		letterCount[index]++;
    		totalLetters++;
    	}
    }
    
    public String nextLetter() {
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	for(int i = 0; i < letterCount.length; i++) {
    		letterRatio[i] = (double) letterCount[i]/totalLetters;
    	}
    	int index = 0;
    	double largest = 0;
    	for(int i = 0; i < letterRatio.length; i++) {
    		letterRatio[i] *= Math.random();
    		if(letterRatio[i] > largest) {
    			largest = letterRatio[i];
    			index = i;
    		}
    	}
    	
    	return ""+alphabet.charAt(index);
    }
    

    public boolean contains(Object o) {
        if (! (o instanceof String)) return false;
        return Collections.binarySearch(this, (String) o) >= 0;
    }

    public boolean add(String s) {
    	int index = Collections.binarySearch(this,  s);
    	if (index >= 0) return false;
    	
    	super.add(-index, s);
    	return true;
    }
    

    public boolean addAll(Collection<? extends String> c)
    {
    	for (String s : c) {
    		if (this.contains(s)) {
    			throw new RuntimeException("Cannot add duplicate words.");
    		}
    	}
    	
    	boolean result = super.addAll(c);
    	Collections.sort(this);
    	return result;
    }
    
    public void add(int index, String s) {
    	if (Collections.binarySearch(this,  s) != -index)
        	super.add(-index, s);
        else {
			throw new RuntimeException("Adding " + s + " at position " + index + " would break the word order");
        }
    }
    
    public int getLongestWordLength() {
    	return this.longestWordLength;
    }
 
    public void Dump() {
        char previous = this.get(0).charAt(0);
        
        for (int i = 0; i < this.size(); i++) {
        	String word = this.get(i);
        	
        	if (word.charAt(0) != previous) {
        		System.out.println("\n");
        		previous = word.charAt(0);
        	}
        	
        	System.out.print(word + " ");
        }
        
        System.out.println();
    }
}
