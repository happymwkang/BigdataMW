import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] a3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;

		for (int i = 0; i < answer.length; i++) {
				if (answer[i] == a1[i]) {
					score1++;
			}
		}
		// System.out.println("ddddddasdf         " + score1);
		
		for (int i = 0; i < answer.length; i++) {
				if (answer[i] == a2[i]) {
					score2++;
			}
		}
		// System.out.println("als     " + score2);
		
		for (int i = 0; i < answer.length; i++) {
					if (answer[i] == a3[i]) {
						score3++;
			}
	
		}
		// 수정부분
		  max_score = Math.max(score1, Math.max(score2, score3));
        			List<Integer> list = new ArrayList<>();
       			 if(max_score == score1) list.add(1);
       			 if(max_score == score2) list.add(2);
       			 if(max_score == score3) list.add(3);
        
      			  answer = new int[list.size()];
     			   for(int i=0; i<list.size(); i++) {
       			     answer[i] = (int) list.get(i);
      				  return result;
	}
    
}