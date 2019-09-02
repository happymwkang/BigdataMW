import java.util.*;
class Solution {
  public int[] solution(int[] arr) {
       int[] test = arr.clone();
		Arrays.sort(test);
		int min = test[0];
        

		if (arr.length > 1) {
			int[] answer = new int[arr.length - 1];

			for (int j = 0; j < answer.length; j++) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > min && arr[i] != 0) {
						answer[j] = arr[i];
						arr[i]=0;
						break;
					}
				}
			}
			return answer;
		} else if (arr.length == 1) {
			int[] answer = { -1 };
			return answer;
		}
		return null;
  }
}