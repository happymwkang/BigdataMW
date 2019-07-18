package probono.model.dto;

import lombok.Data;

@Data
public class Women extends People{
	private String gender;
	
	public Women() {}
	public Women(String name, int age, String job, String adress, 
			int height, int weight, int grade, String comment, String gender) {
		super(name, age, job, adress, height, weight, grade, comment);
		this.gender = gender;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", 성별 : ");
		builder.append(gender);		
		builder.append("]");
		return builder.toString();
	}
	
}
