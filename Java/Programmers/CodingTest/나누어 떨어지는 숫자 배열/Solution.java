import java.util.*;
class Solution {
  public int[] solution(int[] arr, int divisor) {
     int[] answer = new int[arr.length];
	       
	      int size = 0;
	          
	      for(int i = 0 ; i < answer.length; i++){
	          if(arr[i]%divisor == 0){
	              size++;
	          }
	      }
	      
	      if(size == 0 ){
	    	  int[] result = new int[1];
	          result[0] = -1;
	      }
	      
	      int[] result = new int[size];
	          
	      for(int i = 0 ; i < result.length; i++){
	          for(int j = 0 ; j < answer.length ; j++) {
	        	  if(arr[j]%divisor == 0 && arr[j] != 0){
		              result[i] = arr[j];
		              arr[j]= 0;
		              break;
		             }  
	          }
	      }
        Arrays.sort(result);
	      if(result.length==0){
	          result = new int[1];
              result[0]= -1;
	      }
	      return result;
  }
}