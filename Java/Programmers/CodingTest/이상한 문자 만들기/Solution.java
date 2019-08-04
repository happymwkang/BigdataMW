class Solution {
  public String solution(String s) {
      String answer = "";
      String[] test =  s.split(" ");
		
		for(int i=0; i < test.length ; i++) {
			for(int j = 0; j < test[i].length(); j++) {
				if(Character.isLowerCase(test[i].charAt(j))) {
				answer += Character.toUpperCase(test[i].charAt(j));		
				}else if(Character.isUpperCase(test[i].charAt(j))){
					answer += Character.toLowerCase(test[i].charAt(j));	
				}
			}
			answer += " ";
		}
      return answer;
  }
}