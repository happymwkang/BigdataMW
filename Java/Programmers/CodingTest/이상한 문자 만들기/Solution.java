class Solution {
  public String solution(String s) {
      String answer = "";
	  String[] test =  s.split(" ", -1);
			
			for(int i=0; i < test.length ; i++) {
				for(int j = 0; j < test[i].length(); j++) {
					if(j%2==0) {
					answer += Character.toUpperCase(test[i].charAt(j));		
					}else if(j%2!=0){
						answer += Character.toLowerCase(test[i].charAt(j));	
					}
				}
				if(i!= test.length-1 ) {
					answer += " ";
				}
			}
	      return answer;
  }
}