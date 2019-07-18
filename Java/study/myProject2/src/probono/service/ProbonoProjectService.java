package probono.service;

import java.util.ArrayList;

import probono.exception.NotExistException;
import probono.model.MarryModelVirtualDB;
import probono.model.dto.Man;
import probono.model.dto.MarryProject;
import probono.model.dto.People;
import probono.model.dto.Women;


public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	private MarryModelVirtualDB projectVirtualData = MarryModelVirtualDB.getInstance();

	private ProbonoProjectService(){}
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	//모든 Project 반환
	public ArrayList<MarryProject> getAllRequster() {
		return projectVirtualData.getRequsterList();
	}

	//Project 검색
	public MarryProject getMarryProject(String requesterName) {
			MarryProject requester = null;
			ArrayList<MarryProject> requsterList = getAllRequster();
			for (int i = 0; i < requsterList.size(); i++) {
				if(requesterName.equals(requsterList.get(i).getRequester())) {
					requester = requsterList.get(i);
					break;
				}
						
//			ArrayList<ProbonoProject> projectList = getAllProjects();
//			for (ProbonoProject p  : projectList) {
//			if(projectName.equals(p.getProbonoProjectName())) {
//				project = p;
//				break;
//			}
			}
			return requester;
	}
	
	
	//Project 추가
	public void projectInsert(MarryProject project) {
		projectVirtualData.insertRrequster(project);
	}
	
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정
	public void projectUpdate(String requsterName, People people) throws NotExistException{
		MarryProject requster = getMarryProject(requsterName);
		if(requsterName == null){
			throw new NotExistException("xxxxxxx 수정하고자 하는 남자가 없습니다. xxxxxxx\n");
		}else if(people instanceof Man) {
			requster.setMan((Man)people);
		}else { System.out.println("의뢰인을 다시 확인 바랍니다."); }
	}	
		
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정
		public void projectUpdate2(String requsterName, People people) throws NotExistException{
			MarryProject requster = getMarryProject(requsterName);
			if(requsterName == null){
				throw new NotExistException("xxxxxxx 수정하고자 하는 사람이 없습니다. xxxxxxx\n");
			}else if(people instanceof Women) {
				requster.setWomen((Women)people);
			}
		}	

	//Project 삭제
	public void projectDelete(String requsterName) throws NotExistException{
		if(requsterName == null){
			throw new NotExistException("xxxxxxx 수정하고자 하는 Project가 미 존재합니다. xxxxxxx\n");
		}
		ArrayList<MarryProject> requsterList = getAllRequster();
		for(int i =0; i<requsterList.size(); i++) {
			if(requsterName.equals(requsterList.get(i).getRequester())) {
				requsterList.remove(i);
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