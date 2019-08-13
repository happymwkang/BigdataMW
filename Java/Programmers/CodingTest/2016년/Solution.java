import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
  public String solution(int a, int b) {
      String answer = "";
      int y = 2016;
      
      String d = y+"/"+a+"/"+b;
	  SimpleDateFormat a1 = new SimpleDateFormat("yyyy/M/d");
      
      try{
          Date test_date =  a1.parse(d);
          
          if( test_date.getDay()==0) {
			answer = "SUN";
		}else if(test_date.getDay()==1) {
			answer = "MON";
		}else if(test_date.getDay()==2) {
			answer = "TUE";
		}else if(test_date.getDay()==3) {
			answer = "WED";
		}else if(test_date.getDay()==4) {
			answer = "THU";
		}else if(test_date.getDay()==5) {
			answer = "FRI";
		}else if(test_date.getDay()==6) {
			answer = "SAT";
         }
     }catch(ParseException e){
          e.printStackTrace();
      }
      return answer;
  }
}