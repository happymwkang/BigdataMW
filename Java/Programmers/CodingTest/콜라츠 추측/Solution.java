class Solution {
  public int solution(int num) {
      int answer = 0;
	      
	      while(num !=1) {
	    	
	    	  if(num%2 ==0) {
	    		  num = num/2;
	    		 // System.out.println("짝수num " + num);
	    		  answer++;
		      }else if(num%2 != 0) {
		    	  num = (num*3)+1;
		    	  //System.out.println("홀수num " + num);
		    	  answer++;
		      }
	    	  //System.out.println("answer상황 " + answer);
	    	  if(answer ==450) {
	    		  answer = -1;
	    		  break;
	    	  }
	      }
	      return answer;
  }
}