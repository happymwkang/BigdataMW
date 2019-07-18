package probono.model.dto;

import lombok.Data;

@Data
public class Probono {
	private String probonoId;//재능 기부 구분을 위한 id
	private String probonoName;//재능 기부 유형 이름
	private String probonoPurpose;//재능 기부 목적(활동 영역)
	
	public Probono() {}
	public Probono(String probonoId, String probonoName, String probonoPurpose) {
		super();
		this.probonoId = probonoId;
		this.probonoName = probonoName;
		this.probonoPurpose = probonoPurpose;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[프로보노 아이디 : ");
		builder.append(probonoId);
		builder.append(", 프로보노 이름 : ");
		builder.append(probonoName);
		builder.append(", 프로보노 목적 : ");
		builder.append(probonoPurpose);
		builder.append("]");
		return builder.toString();
	}
}
