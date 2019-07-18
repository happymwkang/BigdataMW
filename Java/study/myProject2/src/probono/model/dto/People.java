package probono.model.dto;

import lombok.Data;

@Data
public class People {
	private String name;
	private int age;
	private String job;
	private String adress;
	private int height;
	private int weight;
	private int grade;
	private String comment;
	

	public People() {}
	public People(String name, int age, String job, String adress, 
					int height, int weight, int grade, String comment) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.adress = adress;
		this.height = height;
		this.weight = weight;
		this.grade = grade;
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[이름 : ");
		builder.append(name);
		builder.append(", 나이 : ");
		builder.append(age);
		builder.append(", 직업 : ");
		builder.append(job);
		builder.append(", 거주지 : ");
		builder.append(adress);
		builder.append(", 키 : ");
		builder.append(height);
		builder.append(", 몸무게 : ");
		builder.append(weight);
		builder.append(", 등급 : ");
		builder.append(grade);
		builder.append(", 희망사항 : ");
		builder.append(comment);
		return builder.toString();
	}
}

