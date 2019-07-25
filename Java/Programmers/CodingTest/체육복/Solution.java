class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int ready = n - lost.length - reserve.length;
        for(int i = 0 ; i < lost.length ; i++){
            for(int j = 0 ; j < reserve.length ; j++){
                if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1 ){
                    answer++;                  
                    reserve[j]=0;
                    break;
                }            
            }            
        }        
        return answer+ready+reserve.length;
        
//         for(int i=reserve.length ; i > 0 ; i--){
            
//         }
            
    }
}