class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      if(a < b){
          for(a = a; a <= b ; a++){
              answer += a;
          }
          return answer;
      }
      if(b < a){
          for(b = b; b <= a ; b++){
              answer +=b;
          }  
          return answer;
      }
      if(a==b){
          answer = a;
      }
      return answer;
  }
}