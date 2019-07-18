package probono.model.dto;

import lombok.Data;

@Data
public class MarryProject {

	private String requester; //진행되는 실제 플젝트 이름
	private Man man; //기부 내용
	private Women women; //기부자
	private Marry marry; //수혜자

	public MarryProject() {}
	public MarryProject(String requester, Man man,
			Women women, Marry marry) {
		this.requester = requester;
		this.man = man;
		this.women = women;
		this.marry = marry;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 의뢰인명 : ");
		builder.append(requester);
		builder.append("\n2. 남성 정보 : ");
		builder.append(man);
		builder.append("\n3. 여성 정보: ");
		builder.append(women);
		builder.append("\n4. 호감도 및 최종 마음: ");
		builder.append(marry);
		return builder.toString(); 
	}
}
