package probono.service;

import java.util.ArrayList;

import probono.exception.NotExistException;
import probono.model.ProbonoModelVirtualDB;
import probono.model.dto.Activist;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;


public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	private ProbonoModelVirtualDB projectVirtualData = ProbonoModelVirtualDB.getInstance();

	private ProbonoProjectService(){}
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	//모든 Project 반환
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectVirtualData.getProjectList();
	}

	//Project 검색
	public ProbonoProject getProbonoProject(String projectName) {
			ProbonoProject project = null;
			ArrayList<ProbonoProject> projectList = getAllProjects();
			for (int i = 0; i < projectList.size(); i++) {
				if(projectName.equals(projectList.get(i).getProbonoProjectName())) {
					project = projectList.get(i);
					break;
				}
						
//			ArrayList<ProbonoProject> projectList = getAllProjects();
//			for (ProbonoProject p  : projectList) {
//			if(projectName.equals(p.getProbonoProjectName())) {
//				project = p;
//				break;
//			}
			}
			return project;
	}
	
	
	//Project 추가
	public void projectInsert(ProbonoProject project) {
		projectVirtualData.insertProject(project);
	}
	
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정
	public void projectUpdate(String projectName, People people) throws NotExistException{
		ProbonoProject project = getProbonoProject(projectName);
		if(project == null){
			throw new NotExistException("xxxxxxx 수정하고자 하는 Project가 미 존재합니다. xxxxxxx\n");
		}else if(people instanceof Activist) {
			project.setActivist((Activist)people);
		}else if(people instanceof Recipient) {
			project.setReceive((Recipient)people);
		}	
		
//		 int index = getAllProjects().indexOf(projectName);
//		 Recipient recipient = (Recipient)people;
//		 getAllProjects(index).set(people);
		
	}
	
	//Project 삭제
	public void projectDelete(String projectName) throws NotExistException{
		ProbonoProject project = getProbonoProject(projectName);
		if(project == null){
			throw new NotExistException("xxxxxxx 수정하고자 하는 Project가 미 존재합니다. xxxxxxx\n");
		}
		ArrayList<ProbonoProject> projectList = getAllProjects();
		for(int i =0; i<projectList.size(); i++) {
			if(projectName.equals(projectList.get(i).getProbonoProjectName())) {
				projectList.remove(i);
				break;
			}
		}
		
		

// for-each문 내가 작성한 방법.
//		int index=0;
//		ProbonoProject project = getProbonoProject(projectName);
//		if(project == null){
//			throw new NotExistException("xxxxxxx 수정하고자 하는 Project가 미 존재합니다. xxxxxxx\n");
//		}
//		ArrayList<ProbonoProject> projectList = getAllProjects();
//		for (ProbonoProject p  : projectList) {
//		if(projectName.equals(p.getProbonoProjectName()) && p!=null) {
//			projectList.remove(index);
//			break;
//			}
//		index ++;
//		}
	}
		
}