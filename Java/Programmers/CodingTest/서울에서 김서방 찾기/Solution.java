class Solution {
  public String solution(String[] seoul) {
      String answer = "";
      int i = 0;
      for(i = 0; i < seoul.length; i++){
          if(seoul[i].equals("Kim")){
              answer = "�輭���� " + i + "�� �ִ�";
              break;
          }
      }
      return answer;
  }
}