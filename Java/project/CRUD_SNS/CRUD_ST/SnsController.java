package step04_miniProject;


public class SnsController {
	public static void request(int reNumber) {
		if(reNumber == 1) {			
			SnsModel.write(new Sns("ȫ�浿", 5555, "����մϴ�"));
			EndView.printSuccess("��� �Ǿ����ϴ�.");
		}else if(reNumber == 2) {
			EndView.printAll(SnsModel.getAll());
		}else if(reNumber == 3) {
			char r = SnsModel.delete("�赿��", 5555);
			if(r == 'a') {
				EndView.printSuccess("���� �Ǿ����ϴ�.");	
			}else if(r == 'b') {
				EndView.printFail("������� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}else if(r == 'c') {
				EndView.printFail("������� ���̵� �������� �ʽ��ϴ�.");
			}else if(r == 'd') {
				EndView.printFail("�Խñ��� �������� �ʽ��ϴ�.");
			}else {
				EndView.printFail("�Խñ��� �������� �ʽ��ϴ�.");
			}
		}else if(reNumber == 4) {
			char r = SnsModel.modify("ȫ�浿", 5555, "���ھ� ����մϴ�.");
			if(r == 'a') {
				EndView.printSuccess("���� �Ǿ����ϴ�");	
			}else if(r == 'b') {
				EndView.printFail("������� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}else if(r == 'c') {
				EndView.printFail("������� ���̵� �������� �ʽ��ϴ�.");
			}else if(r == 'd') {
				EndView.printFail("�Խñ��� �������� �ʽ��ϴ�.");
			}else {
				EndView.printFail("�Խñ��� �������� �ʽ��ϴ�.");
			}
		}
	}
}
