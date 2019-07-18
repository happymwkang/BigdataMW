﻿package probono.model.dto;

import lombok.Data;

@Data
public class Activist extends People{
	private String major;
	
	public Activist() {}
	public Activist(String major) {
		this.major = major;
	}
	public Activist(String id, String name, String password, String major) {
		super(id, name, password);
		this.major = major;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", 재능 기부 분야 : ");
		builder.append(major);		
		builder.append("]");
		return builder.toString();
	}
	
}
