package step04_miniProject;


public class SnsController {
	public static void request(int reNumber) {
		if(reNumber == 1) {			
			SnsModel.write(new Sns("홍길동", 5555, "사랑합니다"));
			EndView.printSuccess("등록 되었습니다.");
		}else if(reNumber == 2) {
			EndView.printAll(SnsModel.getAll());
		}else if(reNumber == 3) {
			char r = SnsModel.delete("김동범", 5555);
			if(r == 'a') {
				EndView.printSuccess("삭제 되었습니다.");	
			}else if(r == 'b') {
				EndView.printFail("사용자의 비밀번호가 일치하지 않습니다.");
			}else if(r == 'c') {
				EndView.printFail("사용자의 아이디가 존재하지 않습니다.");
			}else if(r == 'd') {
				EndView.printFail("게시글이 존재하지 않습니다.");
			}else {
				EndView.printFail("게시글이 존재하지 않습니다.");
			}
		}else if(reNumber == 4) {
			char r = SnsModel.modify("홍길동", 5555, "엔코아 사랑합니다.");
			if(r == 'a') {
				EndView.printSuccess("수정 되었습니다");	
			}else if(r == 'b') {
				EndView.printFail("사용자의 비밀번호가 일치하지 않습니다.");
			}else if(r == 'c') {
				EndView.printFail("사용자의 아이디가 존재하지 않습니다.");
			}else if(r == 'd') {
				EndView.printFail("게시글이 존재하지 않습니다.");
			}else {
				EndView.printFail("게시글이 존재하지 않습니다.");
			}
		}
	}
}
