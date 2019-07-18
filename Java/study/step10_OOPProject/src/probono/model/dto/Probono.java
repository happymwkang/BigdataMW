﻿package probono.model.dto;

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
	
	public String getProbonoId() {
		return probonoId;
	}
	public void setProbonoId(String probonoId) {
		this.probonoId = probonoId;
	}
	public String getProbonoName() {
		return probonoName;
	}
	public void setProbonoName(String probonoName) {
		this.probonoName = probonoName;
	}
	public String getProbonoPurpose() {
		return probonoPurpose;
	}
	public void setProbonoPurpose(String probonoPurpose) {
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
