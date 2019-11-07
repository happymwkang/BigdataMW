import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
         // System.out.println(Arrays.toString(people));
		 Arrays.sort(people);
		 // System.out.println(Arrays.toString(people));
		 
	        int answer = 0;
	        int index = people.length - 1;
	        
	        for(int i = 0; i <= index; i++, answer++) { 
	            while(index > i && people[i] + people[index--] > limit) {
	            	answer++;
	            // System.out.println("i값 : " + i + " index값 : " + index);
	            }
	        }
	        return answer;
	}
}