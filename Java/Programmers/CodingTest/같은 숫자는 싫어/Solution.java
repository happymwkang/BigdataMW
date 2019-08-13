import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
		int j = 0;
		ArrayList t = new ArrayList();	

		            for(int i = 0 ; i < arr.length ; i++) {
		            	if(j!=arr.length-1) {
		            		j++;
	            		}else if(j == arr.length-1 && arr[arr.length-1] == arr[arr.length-2]) {
	            			t.add(arr[arr.length-1]);
	            		}else if(j == arr.length-1 && arr[arr.length-1] != arr[arr.length-2]) {
	            			t.add(arr[arr.length-1]);
	            		}
		            	if(arr[i]!=arr[j]) {
		            		t.add(arr[i]);
		            	}
	            			
	            	}
		            
		            int[] answer = new int[t.size()];
		            for(int i = 0 ; i < t.size() ; i++) {
		            	answer[i]= (int)t.get(i);
		            }
        return answer;
	}
}