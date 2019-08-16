class Solution {
  public boolean solution(int x) {
      boolean answer = true;

	      String tranNum = String.valueOf(x);
	      int rset = 0;
	      
	      for (int i = 0 ; i < tranNum.length() ; i++){
	    	  rset += Integer.parseInt(String.valueOf(tranNum.charAt(i))); 
	          
	      }
	      if( x % rset != 0) {
	    	  answer = false;
	      }
	      
	      return answer;
  }
}