class Solution {
  public int solution(int n) {
          int answer = 0;
	      String inPutSt = "";	  
	      String outPutSt = "";
	      int inPut = 0;
	      int outPut = 0;
	      boolean flag = false;
	      
	      answer = n;
	      inPutSt = Integer.toBinaryString(n);
	      
	      for(int i =0 ; i < inPutSt.length() ; i++) {
	    	  if (inPutSt.charAt(i)=='1') {
	    		  inPut++;
	    	  }
	      }
	      while(flag == false) {
	      
	    	  answer++;
		      outPutSt = Integer.toBinaryString(answer);
		      for(int i = 0; i < outPutSt.length() ; i++) {
		    	  if (outPutSt.charAt(i)=='1') {
		    		  outPut++;
		    	  }
		      }
		      if(inPut == outPut) {
		    	  flag = true;
		      }else {
		    	  outPut = 0;
		      }
		      
	      }
	      return answer;
  }
}