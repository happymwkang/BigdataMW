package probono.service;

import org.apache.log4j.Logger;

import probono.controller.ProbonoController;

public class ProbonoAdminService {
	static  Logger log = Logger.getLogger(ProbonoController.class.getName());
	private static ProbonoAdminService instance = new ProbonoAdminService();
	
	public static ProbonoAdminService getInstance() {
		return instance;
	}
	
	public Logger SelectLog() {
		log.info("��ȸ�Ϸ�");
		return log;
	}
	
	public Logger UpdateLog() {
		log.info("�����Ϸ�");
		return log;
	}
	
	public Logger DeleteLog() {
		log.info("�����Ϸ�");
		return log;
	}
	
	public Logger SaveLog() {
		log.info("����Ϸ�");
		return log;
	}
	
	public Logger UpdateFailLog() {
		log.info("�������� �ʾҽ��ϴ�.");
		return log;
	}
	
	public Logger DeleteFailLog() {
		log.info("�������� �ʾҽ��ϴ�.");
		return log;
	}
	
	public Logger SelectFailLog() {
		log.info("�˻��Ͻ� ������Ʈ�� �����ϴ�.");
		return log;
	}
	
	
		
}
