import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int[] key = {};
        
        	for(int i = 0 ; i < commands.length ; i++ ) {
			key = Arrays.copyOfRange(array, commands[i][0], commands[i][1]);
			Arrays.sort(key);		
				answer[i] = key[commands[i][2]-1];
		}
		
        
        return answer;
    }
}