class Solution {
  public int solution(int n) {
           int answer = 0;
           boolean flag = false;

	     for (int i = 2 ; i <= n ; i++) {
	    	  flag = true;
	    	  for(int j = 2 ; j*j <= i ; j++) {
	    		  if(i%j == 0) {
	    			  flag = false;
                      break;
	    		  }
	    	  }
             if(flag){
                 answer++;
             }
	      }
	      return answer;
  }
}