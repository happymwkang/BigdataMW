package probono.view;

import probono.controller.ProbonoController;
import probono.model.dto.Man;
import probono.model.dto.Marry;
import probono.model.dto.MarryProject;
import probono.model.dto.Women;

public class StartView {
	
	public static void main(String[] args) {
		
		ProbonoController controller = ProbonoController.getInstance();
		
		//새로운 기부자
		Man man1 = new Man("아무개", 27, "검사", "서울", 166, 82, 1, "공부만했어요","남");
		//새로운 수혜자
		Women women1 = new Women("나도도", 29, "아나운서", "서울", 168, 48, 1, "덤벼","여");
		//새로운 재능 기부 내용
		Marry marry = new Marry(0, 0);
		//새로운 재능 기부 프로젝트
		MarryProject newRequster = new MarryProject("나도도", man1, women1, marry);
			
		
		//모든 프로젝트 검색
		System.out.println("***** 1. Project 생성 후 모든 Project 검색 *****");
		controller.requsterListView();
		
		System.out.println();
		
		//새로운 프로젝트 저장		
		System.out.println("***** 2. 새로운 Project 저장 후  모든 Project 검색 *****");
		controller.insertProject(newRequster);
		controller.requsterListView();
				
		System.out.println();
		
		//존재하는 프로젝트 검색
		System.out.println("***** 3. 존재하는 Project 검색 *****");
		controller.projectView("강민웅");
		
		System.out.println();
		
		System.out.println("***** 4. 미존재하는 Project 검색 - 예외처리 확인용 *****");
		controller.projectView("슈바이처 ---");
		
		System.out.println();
		
		//존재하는 프로젝트 업데이트 test
		System.out.println("***** 5. 존재하는 Project 수정 후 수정한 Project 검색 *****");
		controller.updateProject("노관심",  new Man("노관심", 30, "백수", "서울", 174, 68, 1, "결혼 할 생각은 있어요","남"));
		controller.projectView("노관심");
		
		System.out.println();
		
		//미 존재하는 프로젝트 업데이트 test : 예외 발생
		System.out.println("***** 6. 미존재하는 Project 수정 - 예외처리 확인용 *****");
		controller.updateProject("마더테레사--", new Women("무관심", 26, "점원", "서울", 160, 45, 1, "운명이 있겠죠","여"));
		
		System.out.println();
		
		//모든 프로젝트 검색 또는 삭제한 프로젝트 검색
		System.out.println("***** 7. 의뢰인 삭제 후 해당 Project 검색 *****");
		controller.deleteProject("노관심");
		controller.projectView("노관심");
		
	}
}
