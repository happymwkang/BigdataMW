import java.util.*;

class Solution {
  public int solution(int[] d, int budget) {
	      int answer = 0;
	      int status = 0;
	      int i = 0;
	      Arrays.sort(d);
	      
	      for( i = 0 ; i < d.length ; i++) {
	    	  if(status < budget) {
	    		  status += d[i];
	    		  answer++;
	    	  }
	      }
	      if( status == budget || (i == d.length && status < budget)) {
	    	  answer = answer +1;
	      }
	      return answer-1;
  }
}