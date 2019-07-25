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
        int max_score = 0;

		for (int i = 0; i < answers.length; i++) {
				if (answers[i] == a1[i%5]) {
					score1++;
			}
		}
		// System.out.println("ddddddasdf         " + score1);
		
		for (int i = 0; i < answers.length; i++) {
				if (answers[i] == a2[i%8]) {
					score2++;
			}
		}
		// System.out.println("als     " + score2);
		
		for (int i = 0; i < answers.length; i++) {
					if (answers[i] == a3[i%10]) {
						score3++;
			}
	
		}
		// System.out.println("testest " + score3);

    max_score = Math.max(score1, Math.max(score2, score3));
        List<Integer> list = new ArrayList<>();
        if(max_score == score1) list.add(1);
        if(max_score == score2) list.add(2);
        if(max_score == score3) list.add(3);
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = (int) list.get(i);
        }
            return answer;
   }
}