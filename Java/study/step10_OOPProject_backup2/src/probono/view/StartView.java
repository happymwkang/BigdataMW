package probono.view;

import probono.controller.ProbonoController;
import probono.model.dto.Activist;
import probono.model.dto.Probono;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class StartView {
	
	public static void main(String[] args) {
		
		ProbonoController controller = ProbonoController.getInstance();
		
		//새로운 기부자
		Activist giver4 = new Activist("giver4", "나기부4", "giver4pw", "미용");
		//새로운 수혜자
		Recipient receive4 = new Recipient("receive4", "나수혜4", "receive4pw", "무상컷팅희망");
		//새로운 재능 기부 내용
		Probono audreyHepbun = new Probono("probono4", "슈바이처 프로젝트", "의료, 보건, 건강과 관련된 분야");
		//새로운 재능 기부 프로젝트
		ProbonoProject newProject = new ProbonoProject("슈바이처 프로젝트", audreyHepbun, giver4, receive4, "응급 처치 프로젝트");
			
		
		//모든 프로젝트 검색
		System.out.println("***** 1. Project 생성 후 모든 Project 검색 *****");
		controller.projectListView();
		
		System.out.println();
		
		//새로운 프로젝트 저장		
		System.out.println("***** 2. 새로운 Project 저장 후  모든 Project 검색 *****");
		controller.insertProject(newProject);
		controller.projectListView();
				
		System.out.println();
		
		//존재하는 프로젝트 검색
		System.out.println("***** 3. 존재하는 Project 검색 *****");
		controller.projectView("슈바이처 프로젝트");
		
		System.out.println();
		
		System.out.println("***** 4. 미존재하는 Project 검색 - 예외처리 확인용 *****");
		controller.projectView("슈바이처 ---");
		
		System.out.println();
		
		//존재하는 프로젝트 업데이트 test
		System.out.println("***** 5. 존재하는 Project 수정 후 수정한 Project 검색 *****");
		controller.updateProject("오드리헵번 프로젝트",  new Recipient("newReceivePeople", "신수혜", "newPw", "무상 파마 지원 받길 원함"));
		controller.projectView("오드리헵번 프로젝트");
		
		System.out.println();
		
		//미 존재하는 프로젝트 업데이트 test : 예외 발생
		System.out.println("***** 6. 미존재하는 Project 수정 - 예외처리 확인용 *****");
		controller.updateProject("마더테레사--", new Recipient("newReceivePeople", "신수혜", "newPw", "무상 파마 지원 받길 원함"));
		
		System.out.println();
		
		//모든 프로젝트 검색 또는 삭제한 프로젝트 검색
		System.out.println("***** 7. 기부자 수정 후 해당 Project 검색 *****");
		controller.deleteProject("슈바이처 프로젝트");
		controller.projectView("슈바이처 프로젝트");
		
		
		
	}
}
