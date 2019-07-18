package moneyLife.model.dto;

import lombok.Data;

@Data
public class People {
	private String name;
	int age;
	private String job;

	public People() {}
	public People(String name,int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}


//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("[아이디 : ");
//		builder.append(id);
//		builder.append(", 이름 : ");
//		builder.append(name);
//		builder.append(", 비밀번호 : ");
//		builder.append(password);
//		return builder.toString();
//	}
}

