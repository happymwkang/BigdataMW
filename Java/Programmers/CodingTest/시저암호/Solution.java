class Solution {
  public String solution(String s, int n) {
      String answer = "";
			

			for (int i = 0; i < s.length(); i++) {
				if (Character.isLowerCase(s.charAt(i)) && (int)s.charAt(i)+n > 122) {
					answer += (char) (97+ n - 123 + (int)s.charAt(i));
				}else if(Character.isUpperCase(s.charAt(i)) && (int) s.charAt(i)+n > 90) {
					answer += (char) (65+ n - 91 + (int)s.charAt(i));
				}else if(s.charAt(i) == ' '){
					answer += ' ';
				}else {
					answer += (char)((int)s.charAt(i)+n);
				}
			}
			return answer;
  }
}