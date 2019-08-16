class Solution {
  public String solution(String s) {
      String answer = "";
	  String[] test =  s.split(" ");
			
			for(int i=0; i < test.length ; i++) {
				boolean isTrue = false;
				for(int j = 0; j < test[i].length(); j++) {
					if(j%2==0) {
					answer += Character.toUpperCase(test[i].charAt(j));		
					}else if(j%2!=0){
						answer += Character.toLowerCase(test[i].charAt(j));	
					}
					isTrue = true;
				}
				if(i!= test.length-1 && isTrue == true) {
					answer += " ";
				}
			}
	      return answer;
  }
}