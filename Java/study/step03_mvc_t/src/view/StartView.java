package view;

import controller.PeopleController;

public class StartView {
	//ctrl+F11
	public static void main(String[] args) {
		/* ���� : ��� ������ �Ϻ��ϰ� �����Ǿ��� ����
		 * test�ϰ��� �ϴ� ���� ����
		 * 	- �˻�, ���� -> �˻�, ���� �Ǵ� ���� -> �˻� 
		 * 
		 * ���� : ���� */
		System.out.println("-- ��� �˻� --");
		PeopleController.request(1);
		PeopleController.request(3);
		System.out.println("-- ���� �� ��� �˻� --");
		PeopleController.request(1);
		PeopleController.request(4);
		System.out.println("-- ���� �� ��� �˻� --");
		PeopleController.request(1);
		
		//.....
	}//���α׷� ���� ����/�޸𸮿� �����ߴ� ���͵��� ��������

}
