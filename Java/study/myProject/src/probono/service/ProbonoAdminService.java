package probono.service;

import org.apache.log4j.Logger;

import MoneyLife.controller.MoneyLifeController;

public class ProbonoAdminService {
	private  Logger log = Logger.getLogger(MoneyLifeController.class.getName());
	private static ProbonoAdminService instance = new ProbonoAdminService();
	
	public static ProbonoAdminService getInstance() {
		return instance;
	}
	
	public Logger SelectLog() {
		log.info("조회완료");
		return log;
	}
	
	public Logger UpdateLog() {
		log.info("수정완료");
		return log;
	}
	
	public Logger DeleteLog() {
		log.info("삭제완료");
		return log;
	}
	
	public Logger SaveLog() {
		log.info("저장완료");
		return log;
	}
	
	public Logger UpdateFailLog() {
		log.info("수정되지 않았습니다.");
		return log;
	}
	
	public Logger DeleteFailLog() {
		log.info("삭제되지 않았습니다.");
		return log;
	}
	
	public Logger SelectFailLog() {
		log.info("검색하신 프로젝트가 없습니다.");
		return log;
	}
	
	
		
}
