package probono.controller;

import java.util.ArrayList;

import moneyLife.model.dto.MoneyLifeProject;
import moneyLife.model.dto.People;
import probono.exception.NotExistException;
import probono.service.MoneyLifeProjectService;
import probono.service.ProbonoAdminService;
import probono.view.EndView;
import probono.view.FailView;

public class MoneyLifeController {
	
	private static MoneyLifeController instance = new MoneyLifeController();
	private MoneyLifeProjectService service = MoneyLifeProjectService.getInstance();
	
	private MoneyLifeController() {}
	
	public static MoneyLifeController getInstance() {
		return instance;
	}
	
	
	//모든 경우 검색
	public void projectListView() {
		ArrayList<MoneyLifeProject> caseList = service.getAllPeople();		
		if(caseList.size() != 0) {
			EndView.JSONObject(caseList);	
			System.out.println(ProbonoAdminService.getInstance().SelectLog());
		}else {
			EndView.messageView("진행중인 프로젝트는 존재하지 않습니다.");
			System.out.println(ProbonoAdminService.getInstance().SelectFailLog());
		}

	}
	
	
	//특정인 검색
	public void projectView(String name) {
		if(service.getName(name)==null) {
			EndView.messageView("검색 요청하신 이름이 존재하지 않습니다.");
			System.out.println(ProbonoAdminService.getInstance().SelectFailLog());
		}else {
			EndView.projectView(service.getName(name));
			System.out.println(ProbonoAdminService.getInstance().SelectLog());
		}
		
	}
	
	
	
	//새로운 사람 저장		
	public void insertProject(MoneyLifeProject name) {
		service.personInsert(name);
		System.out.println(ProbonoAdminService.getInstance().SaveLog());
	}
	
	
	//기존사람 수정
	public void updatePerson(String name, People people) {
		try {
			service.personUpdate(name, people);
			System.out.println(ProbonoAdminService.getInstance().UpdateLog());
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			System.out.println(ProbonoAdminService.getInstance().UpdateFailLog());
			//e.printStackTrace();
		}	
	}
	
	//모든 프로젝트 삭제
	public void deletePerson(String projectName) {
		try {
			service.personDelete(name);
			System.out.println(ProbonoAdminService.getInstance().DeleteLog());
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			System.out.println(ProbonoAdminService.getInstance().DeleteFailLog());
			//e.printStackTrace();
		}	
	}
	
}










