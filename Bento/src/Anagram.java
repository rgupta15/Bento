import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] words = {"vase","bat","gods","latte","name","apres","spit","joke",
				"ham","dog","act","tale","parse","pits","asper","tab","table","mane","late",
				"god","cat","table","save","spare"};
		
		Map<String,ArrayList<String>> anagrams = new HashMap<String,ArrayList<String>>();
		ArrayList<String> newList = new ArrayList<String>();
		char tempArray[];
    	
		//Sort every word as key and add word to list corresponding to that key
		//For eg bat and tab become abt and are added to list corresponding to abt (key)
		for(String word:words) {
			tempArray = word.toCharArray();
			Arrays.sort(tempArray);
			String sortedWord = new String(tempArray);
			newList = anagrams.get(sortedWord);
			if(newList == null) {
				newList = new ArrayList<String>();
			}
			newList.add(word);
			anagrams.put(sortedWord, newList);
		}
	    
		//iterate over hashmap and return lists with anagrams 
	    for(Map.Entry<String,ArrayList<String>> entry : anagrams.entrySet()) {
	    		ArrayList<String> value = entry.getValue();
	    		if(value.size()>1)
	    			System.out.println(value);
	    }
		
	}	

}
