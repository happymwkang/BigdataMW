class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String str = s;
        int resultP = 0;
		int resultY = 0;
		String[] p = {"p","P"};
		String[] y = {"y","Y"};
		boolean result = false;
        
        for(int i = 0; i < p.length; i++) {
			for(int j = 0; j < str.length(); j++) {
				if(p[i].equals(str.substring(j,j+1))) {
					resultP++;
				}
			}
		}
		
		for(int i = 0; i < y.length; i++) {
			for(int j = 0; j < str.length(); j++) {
				if(y[i].equals(str.substring(j,j+1))) {
					resultY++;
				}
			}
		}
        
		if(resultP==resultY) {
			answer = true;
		}else {
			answer = false;
		}
		return answer;
       }
}