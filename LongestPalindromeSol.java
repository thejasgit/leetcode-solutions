public class LongestPalindromeSol {
    public String longestPalindrome(String s) {
        
        String result;
        
      if(s.length()==1)
      return s;
      
      if(s.isEmpty())
      return null;
      
      result = s.substring(0,1);
      
      for(int i=0;i<s.length();i++){
          String palindrome = getPalindrome(s,i,i);
          if(palindrome.length()>result.length())
          result = palindrome;
          
           palindrome = getPalindrome(s,i,i+1);
           if(palindrome.length()>result.length())
          result = palindrome;
      }
      
      return result;
      
        
    }
    
    public static String getPalindrome(String s,int i,int j){
        while(i>=0 && j <=s.length()-1 && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        
        return s.substring(i+1,j);
        
    }
}