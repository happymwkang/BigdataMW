class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int ready = n - lost.length - reserve.length;
         for(int i = 0 ; i < lost.length ; i++){
            for(int j = 0 ; j < reserve.length ; j++){
                if(lost[i]==reserve[j]){
                    answer+=1; 
                    lost[i]=999;
                    reserve[j]=999;
                    break;
                }
            }
         }
        for(int i = 0 ; i < lost.length ; i++){
            for(int j = 0 ; j < reserve.length ; j++){
                if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1 ){
                    answer+=1;                  
                    reserve[j]=999;
                    break;
                }            
            }            
        }   
        return answer+ready+reserve.length;
   }
}