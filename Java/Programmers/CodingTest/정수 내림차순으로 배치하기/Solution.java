import java.util.*;
class Solution {
  public long solution(long n) {
      long answer = 0;
	      String str = String.valueOf(n);
	      int[] result = new int[str.length()];
	      
	      for(int i = 0 ; i < result.length ; i++) {
	    	  result[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
	      }
	      
	      Arrays.sort(result);
	      str = "";
	      for(int i = result.length-1 ; i >= 0 ; i--) {
	    	  
	    	  str += String.valueOf(result[i]);
	      }
	      
	      answer = Long.parseLong(str);
	      
	      return answer;
  }
}