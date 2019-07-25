class Solution {
  public String solution(int n) {
      
      String su = "¼ö";
      String bak ="¹Ú";
      String answer = "";
      for(int i = 0; i < n ; i++){
          if(n%2==0){
              if(i%2==0){
              answer += su;
              }
              if(i%2==1){
                  answer+= bak;
              }
          }
          if(n%2==1 && n!=1){
              if(i%2==0){
              answer += su;
              }
              if(i%2==1){
                  answer += bak;
              }
          }
          if(n==1){
              answer = su;
          }
      }    
      return answer;
  }
}