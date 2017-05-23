public class LongestSubstringSol {
    public int lengthOfLongestSubstring(String s) {
        
        int currentLength = 0, maxLength = 0;
        
        Map<Character,Integer> visit = new HashMap<Character, Integer>();
        
        if(s.length()>0){
        
        visit.put(s.charAt(0), 0);
        currentLength=1; maxLength = 1;
        
        
        for(int i = 1; i< s.length();i++){
        	
        	if(visit.get(s.charAt(i))==null || (i-currentLength > (int)visit.get(s.charAt(i)) )){
        		currentLength++;
        	}
        	else {
        		 if(currentLength>maxLength)
        			 maxLength = currentLength;
        		 
        		 currentLength = i - visit.get(s.charAt(i));
        		
        	}
        	
        	visit.put(s.charAt(i), i);
        }
        }
        
         if(currentLength>maxLength)
			 maxLength = currentLength;
        
        return maxLength; 
        
    }
}