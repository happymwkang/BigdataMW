package moneyLife.model;
//DB가 없는 관계로 test용 데이터 제공 클래스

import java.util.ArrayList;

import moneyLife.model.dto.Bank;
import moneyLife.model.dto.InEvent;
import moneyLife.model.dto.MoneyLifeProject;
import moneyLife.model.dto.OutEvent;
import moneyLife.model.dto.People;

public class MoneyLifeModelVirtualDB {
	
	private static MoneyLifeModelVirtualDB instance = new MoneyLifeModelVirtualDB();
	private ArrayList<MoneyLifeProject> nameList = new ArrayList<MoneyLifeProject>();
	private ArrayList inEventList = new ArrayList();
	private MoneyLifeModelVirtualDB() {
		nameList.add(new MoneyLifeProject("펑펑이",  
					 new Bank("펑펑이", 300000, 150000, 150000), 
					 new People("펑펑이",20,"부자아빠아들"),
					 new InEvent(1, "용돈", 30000),
					 new OutEvent(1, "잃어버림", 20000)));
					 
		nameList.add(new MoneyLifeProject("강민웅", 
					 new Bank("강민웅", 300000, 0, 300000), 
					 new People("강민웅",32,"IT"),
					 new InEvent(1, "용돈", 50000),
					 new OutEvent(2, "생활비", 100000)));
			
	}
		
	public static MoneyLifeModelVirtualDB getInstance() {
		return instance;
	}
	
	public ArrayList<MoneyLifeProject> getPeopleList(){
		return nameList;
	}
	
	public void insertPerson(MoneyLifeProject newPerson) {
		nameList.add(newPerson);
	}
	
	public void inOutStatus(String personName, Bank bank) {
		int a;
		for(int i=0 ; i<getPeopleList().size() ; i++ )
		if(personName.equals(getPeopleList().get(i).getPersonName())) {
			a=nameList.get(i).getBank().getIn() + nameList.get(i).getBank().getOut();
		}
	}
}
	
//	private static ProbonoModelVirtualDB instance = new ProbonoModelVirtualDB();
//	private ArrayList<ProbonoProject> projectList = new ArrayList<ProbonoProject>();
//	
//	
//	private ProbonoModelVirtualDB() {
//		projectList.add(new ProbonoProject("오드리헵번 프로젝트", 
//											new Probono("probono1", "오드리헵번 프로젝트", "예술가, 문화관련 프로그램 제공, 전시ㆍ관람 등 기회제공, 미용,환경 캠페인 등 문화ㆍ예술관련 분야"), 
//											new Activist("giver1", "나기부1", "giver1pw", "미용 전문"), 
//											new Recipient("receiver1", "나수혜1", "receiver1pw", "무상컷팅 희망"), "헤어 미용 프로젝트"));
//		
//		projectList.add(new ProbonoProject("키다리아저씨 프로젝트", 
//											new Probono("probono2", "키다리아저씨 프로젝트", "결연, 상담, 멘토, 장학지원, 심리 상담등"), 
//											new Activist("giver2", "나기부2", "giver2pw", "상담 전문"), 
//											new Recipient("receiver2", "나수혜2", "receiver2pw", "장학지원 희망"), "장학 지원 프로젝트"));
//		
//		projectList.add(new ProbonoProject("헤라클래스 프로젝트", 
//											new Probono("probono3", "헤라클래스 프로젝트", "체육활동 및 교육, 집수리 봉사, 운전, 배송, 기술제공 및 자문등"), 
//											new Activist("giver3", "나기부3", "giver3pw", "기술 제공 전문"), 
//											new Recipient("receiver3", "나수혜3", "receiver3pw", "기술 제공 희망"), "기술 지원 프로젝트"));
//	}
//	
//	public static ProbonoModelVirtualDB getInstance() {
//		return instance;
//	}
//	public ArrayList<ProbonoProject> getProjectList(){
//		return projectList;
//	}
//	public void insertProject(ProbonoProject newProject) {
//		projectList.add(newProject);
//	}







