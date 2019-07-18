package probono.controller;

import java.util.ArrayList;

import probono.exception.NotExistException;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.service.ProbonoAdminService;
import probono.service.ProbonoProjectService;
import probono.view.EndView;
import probono.view.FailView;

public class ProbonoController {
	
	private static ProbonoController instance = new ProbonoController();
	private ProbonoProjectService service = ProbonoProjectService.getInstance();
	
	private ProbonoController() {}
	
	public static ProbonoController getInstance() {
		return instance;
	}
	
	
	//모든 프로젝트 검색
	public void projectListView() {
		ArrayList<ProbonoProject> projectList = service.getAllProjects();		
		if(projectList.size() != 0) {
			EndView.JSONObject(projectList);	
			System.out.println(ProbonoAdminService.getInstance().SelectLog());
		}else {
			EndView.messageView("진행중인 프로젝트는 존재하지 않습니다.");
			System.out.println(ProbonoAdminService.getInstance().SelectFailLog());
		}

	}
	
	
	//특정 프로젝트 검색
	public void projectView(String probonoName) {
		if(service.getProbonoProject(probonoName)==null) {
			EndView.messageView("검색 요청하신 프로젝트는 존재하지 않습니다.");
			System.out.println(ProbonoAdminService.getInstance().SelectFailLog());
		}else {
			EndView.projectView(service.getProbonoProject(probonoName));
			System.out.println(ProbonoAdminService.getInstance().SelectLog());
		}
		
	}
	
	
	
	//새로운 프로젝트 저장		
	public void insertProject(ProbonoProject newProject) {
		service.projectInsert(newProject);
		System.out.println(ProbonoAdminService.getInstance().SaveLog());
	}
	
	
	//존재하는 프로젝트 수정
	public void updateProject(String projectName, People people) {
		try {
			service.projectUpdate(projectName, people);
			System.out.println(ProbonoAdminService.getInstance().UpdateLog());
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			System.out.println(ProbonoAdminService.getInstance().UpdateFailLog());
			//e.printStackTrace();
		}	
	}
	
	//모든 프로젝트 삭제
	public void deleteProject(String projectName) {
		try {
			service.projectDelete(projectName);
			System.out.println(ProbonoAdminService.getInstance().DeleteLog());
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			System.out.println(ProbonoAdminService.getInstance().DeleteFailLog());
			//e.printStackTrace();
		}	
	}
	
}










