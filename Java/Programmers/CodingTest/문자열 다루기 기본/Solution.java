class Solution {
  public boolean solution(String s) {
        int result = 0;
        int sLength = s.length();
	      char[] test = {'1','2','3','4','5','6','7','8','9','0'};
      
      if(sLength == 4 || sLength == 6){
	      for(int i = 0 ; i < s.length() ; i++) {
	    	  for(int j =0 ; j < test.length ; j++) {
	    		  if(s.charAt(i)==test[j]) {
	    			  result++;
	    		    }
	    	  }
	      }
      }else {
          return false;
      }
	      if(result == s.length()) {
	    	  return true;
	      }
	      return false;
	  }
}