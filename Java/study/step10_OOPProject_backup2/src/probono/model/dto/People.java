package probono.model.dto;

import lombok.Data;

@Data
public class People {
	private String id;
	private String name;
	private String password;

	public People() {}
	public People(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[아이디 : ");
		builder.append(id);
		builder.append(", 이름 : ");
		builder.append(name);
		builder.append(", 비밀번호 : ");
		builder.append(password);
		return builder.toString();
	}
}

