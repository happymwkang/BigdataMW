class Solution {
  public String solution(String s) {
      String answer = "";
      int getNum = str.length();
      if( getNum%2 == 0) {
        answer=str.substring(Math.floorDiv(getNum, 2), Math.floorDiv(getNum, 2)-1);
      }
      answer=str.substring(Math.floorDiv(getNum, 2),Math.floorDiv(getNum, 2)+1 );
      return answer;
  }
}