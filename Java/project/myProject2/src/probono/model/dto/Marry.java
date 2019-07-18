package probono.model.dto;

import lombok.Data;

@Data
public class Marry {
	private int favorability ;//재능 기부 구분을 위한 id
	private int result;//재능 기부 유형 이름
	
	public Marry() {}
	public Marry(int favorability, int result) {
		this.favorability = favorability;
		this.result = result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[호감도 : ");
		builder.append(favorability);
		builder.append(", 결과 : ");
		builder.append(result);
		builder.append("]");
		return builder.toString();
	}
}
