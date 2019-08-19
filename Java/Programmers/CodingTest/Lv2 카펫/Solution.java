class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        int area = brown+red;
        int n = (brown+red)/2;
            
        for(int i = 3 ; i < n ; i++) {
			for(int j = 3; j < n ; j++) {
				if(i*j == area && (i*2)+(j*2)-4 == brown && i>=j) {
                    
					answer[0]=i;
					answer[1]=j;
					break;
				}
			}
            if(answer[0] !=0){
                break;
            }
		}
        return answer;
    }
}