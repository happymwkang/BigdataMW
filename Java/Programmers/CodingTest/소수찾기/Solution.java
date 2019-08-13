class Solution {
  public int solution(int n) {
      int answer = 0;
      
      if(n > 10){
        for(int i = 11 ; i < n+1 ; i++) {
              if(Math.floorMod(i,2)!=0){
                  if(Math.floorMod(i,3)!=0){
                      if(Math.floorMod(i,5)!=0){
                          answer++;
                          }
                      }
              }
        } 
      }else if(n < 11 && n > 5){
          answer = 4;
      }else if(n == 5){
          answer = 3;
      }else if( n == 4){
          answer = 2;
      }else if(n < 3){
          answer = 1;
      }
      return answer;
    }
      
}