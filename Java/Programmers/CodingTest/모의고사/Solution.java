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
		// System.out.println("testest " + score3);
		int[] result = { score1, score2, score3 };
		Arrays.sort(result);
		System.out.println(result[0]);
        return result;
	}
    
}