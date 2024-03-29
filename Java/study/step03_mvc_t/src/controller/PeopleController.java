/* crud의 모든 요청을 받고 요청 처리 위임 및 결과값을 EndView에게 출력 위임하는 로직
 * 하나의 메소드에서 if 분기문으로 로직 구분
 * StartView.java에서 Controller에서 요청시 
 * 분기문에 사용될 비교 데이터로 요청
 * 1 - 모든 검색, 2 - 개인 검색(  , 3 - 가입(저장), 4-삭제, 5-수정(name값 기준으로 age가 증가)
 */
package controller;

import model.PeopleModel;
import model.domain.People;
import view.EndView;

public class PeopleController {
	public static void request(int reqNumber) {
		if(reqNumber == 1) {
			
			EndView.printAll(PeopleModel.getAll());	
			
		}else if(reqNumber == 2) {
			
		}else if(reqNumber == 3) {
			//PeopleModel.insert(new People("encoreMan1", 20));
			//PeopleModel.insert(new People("encoreMan2", 20));
			
			boolean r = PeopleModel.insert(new People("encoreMan", 20));
			
			if(r) { 
				EndView.printSuccess("가입 성공");
			}else {
				EndView.printFail("가입 실패");
			}
		}else if(reqNumber == 4) {
			PeopleModel.delete("encoreMan");
		}else if(reqNumber == 5) {
			
		}else {
			EndView.printFail("요청하신 정보는 서비스 할 수 없습니다");
		}
	}
}






