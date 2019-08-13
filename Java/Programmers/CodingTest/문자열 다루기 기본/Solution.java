class Solution {
  public boolean solution(String s) {
        int result = 0;
	      char[] test = {'1','2','3','4','5','6','7','8','9','0'};
	      for(int i = 0 ; i < s.length() ; i++) {
	    	  for(int j =0 ; j < test.length ; j++) {
	    		  if(s.charAt(i)==test[j]) {
	    			  result++;
	    		
	    		  }
	    	  }
	      }
	      if(result == s.length()) {
	    	  return true;
	      }
	      return false;
	  }
}