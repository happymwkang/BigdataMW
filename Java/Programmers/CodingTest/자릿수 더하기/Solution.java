import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        int size = str.length();
	        
	        for(int i = 0; i < size; i++) {
	        	answer += Integer.parseInt(String.valueOf(str.charAt(i))); 
	        }
	        return answer;
    }
}