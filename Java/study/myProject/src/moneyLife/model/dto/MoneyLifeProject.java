package moneyLife.model.dto;

import lombok.Data;

@Data
public class MoneyLifeProject {

	private String personName;
	private Bank bank; //은행
	private People people; //사람
	private InEvent inEvent;
	private OutEvent outEvent;
	

	public MoneyLifeProject() {}
	public MoneyLifeProject(String personName, Bank bank, People people, InEvent inEvent, OutEvent outEvent) {
		this.personName = personName;
		this.bank = bank;
		this.people = people;
		this.inEvent = inEvent;
		this.outEvent = outEvent;
	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("1. 프로젝트명 : ");
//		builder.append(name);
//		builder.append("\n2. 재능기부내용 : ");
//		builder.append(probono);
//		builder.append("\n3. 재능 기부자 정보: ");
//		builder.append(activist);
//		builder.append("\n4. 수혜자 정보: ");
//		builder.append(receive);
//		builder.append("\n5. 프로젝트제공내용 : ");
//		builder.append(projectContent);
//		return builder.toString(); 
//	}
}
