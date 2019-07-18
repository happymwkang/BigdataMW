package model;

import model.domain.People;

public class PeopleModel {
	//DB�� ���� �����
	private static People[] allData = new People[5];
	private static int index;//0�ʱ�ȭ
	//test ������ ����
	//byte code�� �ε��ɶ� �ڵ����� ����Ǵ� Ưȭ�� �ڵ�
	static {
		allData[0] = new People("������", 27);
		allData[1] = new People("�ּ���", 29);
		allData[2] = new People("������", 28);
		index = 3;
	}
	//����
	/* People ��ü�� �迭�� ����Ǵ°� ����
	 * ���� ���
	 * ����� �� 1 : name, age�� ���� argument�� �޾Ƽ� People��ü ������ �迭�� ����
	 * ����� �� 2 : People ��ü�� argument �� �޾Ƽ� �迭�� ���� */
	public static boolean insert(People v) {//insert()
		if(index < 5) {
//			allData[index] = v;
//			index++;
			allData[index++] = v;
			return true;
		}else {
			return false;
		}
	}
	//����
	/* �߻� ������ ����� ��
	 * 1. ���� �����͸� ���� ��û
	 * 	- 
	 * 2. �����ϴ� ������ ���� ��û
	 * - ����
	 * - �����ÿ� �迭�� ���� ����
	 * 	1. ������ index�� ������ ����
	 * 		- index : --
	 *  2. �߰� index�� �����ϴ� ������ ����
	 *  	- 5���� �� ����Ǿ� ������  index 2�� ������ 3��° ���� ��û
	 *       : index 2�� ������ ������ ������?
	 *       : index 2�� �⺻ default�� �� ������?(������ ����)
	 *       	- ��� ��� ���� �˻��� index 2������ �����͸� �����ϰ� ���
	 *       	- �߻� ������ ����� ��
	 *       		1. ����� ���� ��ü�� ���밪 Ȱ��(���) �õ��� ���� ���� �߻�
	 *       		2. �ڵ�� ���� ���� ���� �� ���  
	 * 3. ���� : �̸����� ���� ��û
	 * 	- �̸��� �����ϴ��� Ȯ��
	 * 	1. �迭�� �����͸� �ϳ��ϳ� ��ȯ�ؼ� �̸��� ��ȯ : �ݺ�
	 *  2. ��ȯ�� �̸��� parameter�� ���Ե� �������� ��
	 *  3. ������
	 *  	- ���� �� true return
	 *  	- �ݺ� ����
	 *  4. �������� ���� ��� �� ���� ��쿣 false return  
	 *  5. ���ǽ�1 && ���ǽ�2
	 *  	- �� ���ǽ� ��� true�� ��� �ش� {} ����
	 *  	- ����
	 *  		���ǽ�1 �� false�� ��� ������ {} ���� �� �Ұ��̱� ������ �ι�°
	 *  		���ǽ��� ���� ��ü�� ����
	 * 		- ���� ������
	 * 	6. ���ǽ�1 & ���ǽ�2
	 * 		- ���ǽ� 1 �� false�� ��� ���ǽ�2�� ���� �� ��
	 *  */
	public static boolean delete(String name){
		People v = null;
		for(int i=0; i < allData.length; i++) {//  i < 5
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				allData[i] = null;
				return true;
			}			
		}
		return false;		
	}
	public static boolean delete2(String name){
		for(int i=0; i < allData.length; i++) {//  i < 5
			if(allData[i] != null && allData[i].getName().equals(name)) {
				allData[i] = null;
				return true;
			}			
		}
		return false;		
	}
	
	
	
	//����
	
	
	//�ѻ�� ������ �˻�
	
	//��� ����� �˻�
	/* �ܼ��ϰ� �迭 ��ü�� ��ȯ - Controller�� �޾Ƽ� View���� ����� ���� */
	public static People[] getAll() {
		return allData;
	}
	
	
	
	
	
	
	//���߽� PeopleModel�� �ܼ� Ȯ�ο� �� �����׽�Ʈ ������ ����, ���Ŀ� ���� ����
	public static void main(String [] args) {
		System.out.println(2);
	}
}

/*
 * 1. ���
 * 	����, ����, ����, �˻�(��� ���, �� ���)
 * 2. ����
 * 	- �޼ҵ�� 5��
 * 3. �迭�� People���� ����
 * 	- �迭�� ��� ����? �� �޼ҵ��� ���� ����?
 * 		- ��� ����
 *  - ��� ���� : ��� �޼ҵ忡�� ����
 *  - ���� ���� : �޼ҵ� �����߿��� ��� �� �ٸ� �޼ҵ�� ���� �Ұ�
 *  
 * 4. ���� ����
 * 	1. test��  People ��ü : 5���� ����
 *  2. static���� �迭����? non-static?
 *  	- static���� : byte code�� �޸𸮿� ����(����, �ε�)�ɶ� �ڵ� ����
 *  	- static�� ��� 
 *  		- �ܺο��� �� �����͸� ����Ҷ� �� ������ ������ Ŭ������ ��ü ���� ���ʿ�
 *  		- PeopleModel ��ü ���� ���ʿ�
 *  		- PeopleModel ������ ��� �޼ҵ带 static ó��
 *   
 *  	- non-static�� ���
 *  		- �ܺο��� �� �����͸� ����Ҷ� �� ������ ������ Ŭ������ ��ü ���� �ʼ�
 *  		- PeopleModel ��ü ���� �ʼ�
 *  		- PeopleModel�� ������ ��� �޼ҵ�� static ó�� ���ʿ�
 *  		- user(end user)���� ���� ���� ������ ���µ�...���谡 ��� ��� ��û�� ���� 
 *  		PeopleModel ��ü ����
 */













