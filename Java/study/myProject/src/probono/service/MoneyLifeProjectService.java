package probono.service;

import java.util.ArrayList;

import org.w3c.dom.NameList;

import moneyLife.model.MoneyLifeModelVirtualDB;
import moneyLife.model.dto.Bank;
import moneyLife.model.dto.Event;
import moneyLife.model.dto.InEvent;
import moneyLife.model.dto.MoneyLifeProject;
import moneyLife.model.dto.OutEvent;
import probono.exception.NotExistException;

public class MoneyLifeProjectService {
	
	private static MoneyLifeProjectService instance = new MoneyLifeProjectService();
	private MoneyLifeModelVirtualDB projectVirtualData = MoneyLifeModelVirtualDB.getInstance();

	private MoneyLifeProjectService(){}
	public static MoneyLifeProjectService getInstance(){
		return instance;
	}
	//Event 발생
	public Event eventOccur() {
		Event inEvent = new Event();
		int no = (int) (Math.random() * 10) + 1;
		if(no == 1) {
			inEvent.(1, "용돈", 50000);
		}
		
		
		return;
	}
	
	
	
	//모든 사람 반환
	public ArrayList<MoneyLifeProject> getAllPeople() {
		return projectVirtualData.getPeopleList();
	}

	//사람 검색
	public MoneyLifeProject getName(String personName) {
		MoneyLifeProject name = null;
		ArrayList<MoneyLifeProject> nameList = getAllPeople();
		for(MoneyLifeProject p : nameList ) {
			if(personName.equals(p.getPersonName())) {
				name = p;
				break;
			}
		}
		return name;
	}

	//사람 추가
	public void projectInsert(MoneyLifeProject newPerson) {
		projectVirtualData.insertPerson(newPerson);
	}
	
	//이벤트 수정 - 사람 명으로 플러스 이벤트 수정
	public void personUpdate(String personName, Event inEvent) throws NotExistException{
		MoneyLifeProject name = getName(personName);
		if(name == null){
			throw new NotExistException("xxxxxxx 수정하고자 하는 사람이 없습니다. xxxxxxx\n");
		}else if(inEvent instanceof InEvent) {
			name.setInEvent((InEvent)inEvent);
		}
	}	
	
	//이벤트 수정 - 사람 명으로 마이너스 이벤트 수정
	public void personUpdate2(String personName, Event outEvent) throws NotExistException{
		MoneyLifeProject name = getName(personName);
		if(name == null){
			throw new NotExistException("xxxxxxx 수정하고자 하는 사람이 없습니다. xxxxxxx\n");
		}else if(outEvent instanceof OutEvent) {
			name.setOutEvent((OutEvent)outEvent);
		}
	}	
	
	public void moneyUpdate(int in, int out, int money) {
		
		bank.add( 
	}
	
	
	//Project 삭제
	public void personDelete(String personName) throws NotExistException{
		if(personName == null){
			throw new NotExistException("xxxxxxx 수정하고자 하는 Project가 미 존재합니다. xxxxxxx\n");
		}else {
			ArrayList<MoneyLifeProject> nameList = projectVirtualData.getPeopleList();
			for(int i=0; i<projectVirtualData.getPeopleList().size(); i++) {
				if(personName.equals(nameList.get(i).getPersonName())) {
						nameList.remove(i);
						break;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}