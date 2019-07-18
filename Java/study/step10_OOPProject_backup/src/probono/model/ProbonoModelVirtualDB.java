//DB가 없는 관계로 test용 데이터 제공 클래스
package probono.model;

import java.util.ArrayList;

import probono.model.dto.Activist;
import probono.model.dto.Probono;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoModelVirtualDB {
	private static ProbonoModelVirtualDB instance = new ProbonoModelVirtualDB();
	private ArrayList<ProbonoProject> projectList = new ArrayList<ProbonoProject>();
	
	
	private ProbonoModelVirtualDB() {
		projectList.add(new ProbonoProject("오드리헵번 프로젝트", 
											new Probono("probono1", "오드리헵번 프로젝트", "예술가, 문화관련 프로그램 제공, 전시ㆍ관람 등 기회제공, 미용,환경 캠페인 등 문화ㆍ예술관련 분야"), 
											new Activist("giver1", "나기부1", "giver1pw", "미용 전문"), 
											new Recipient("receiver1", "나수혜1", "receiver1pw", "무상컷팅 희망"), "헤어 미용 프로젝트"));
		
		projectList.add(new ProbonoProject("키다리아저씨 프로젝트", 
											new Probono("probono2", "키다리아저씨 프로젝트", "결연, 상담, 멘토, 장학지원, 심리 상담등"), 
											new Activist("giver2", "나기부2", "giver2pw", "상담 전문"), 
											new Recipient("receiver2", "나수혜2", "receiver2pw", "장학지원 희망"), "장학 지원 프로젝트"));
		
		projectList.add(new ProbonoProject("헤라클래스 프로젝트", 
											new Probono("probono3", "헤라클래스 프로젝트", "체육활동 및 교육, 집수리 봉사, 운전, 배송, 기술제공 및 자문등"), 
											new Activist("giver3", "나기부3", "giver3pw", "기술 제공 전문"), 
											new Recipient("receiver3", "나수혜3", "receiver3pw", "기술 제공 희망"), "기술 지원 프로젝트"));
	}
	
	public static ProbonoModelVirtualDB getInstance() {
		return instance;
	}
	public ArrayList<ProbonoProject> getProjectList(){
		return projectList;
	}
	public void insertProject(ProbonoProject newProject) {
		projectList.add(newProject);
	}
}






