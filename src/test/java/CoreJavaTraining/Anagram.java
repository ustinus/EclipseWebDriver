package CoreJavaTraining;

import java.util.HashMap;

public class Anagram {
	
		public static void main(String[] args) {
		
		// Passing cases
		System.out.println(isAnagrams("add", "dda"));	
		System.out.println(isAnagrams("BBBBAA", "BBBAAB"));	
		System.out.println(isAnagrams("bbBBaA", "BBbaAB"));	
		System.out.println(isAnagrams("aaa", "aa"));	
		System.out.println(isAnagrams("seesss", "sssaaa"));	
		
		}
		
		public static boolean isAnagrams(String word1, String word2){
			if(word1.length() != word2.length()) { 
				return false;
			} 
			
		    HashMap<Character, Integer> word1Map = populateHashMap(word1);
		    HashMap<Character, Integer> word2Map = populateHashMap(word2);
		    
		    for(Character key: word1Map.keySet()){
		    	if(word1Map.get(key) == word2Map.get(key)) {
		            continue;
		        }
		        else
		            return false;
		    }
		return true; 
		}

		public static HashMap populateHashMap(String word1) { 
		HashMap <Character, Integer> wordmap = new HashMap<Character, Integer>();
		    if(word1.length() >0) {
		        for(int i =0; i< word1.length(); i++) 
		        {
		            if (wordmap.get(word1.charAt(i)) != null) {
		            	Integer k = wordmap.get(word1.charAt(i));
		            	
		            	wordmap.put(Character.toLowerCase(word1.charAt(i)), k +1);
		            }
		            else {
		                wordmap.put(Character.toLowerCase(word1.charAt(i)), 1);
		            }
		        }     
		    }
		return wordmap;
		}
}
