package moneyLife.model.dto;

import lombok.Data;

@Data
public class Bank extends People{
	private String name;
	private int in;
	private int out;
	private int money;
		
	public Bank() {}
	public Bank(String name, int in, int out, int money) {
		this.name = name;
		this.in = in;
		this.out = out;
		this.money = money;
	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append(super.toString());
//		builder.append(", 재능 기부 분야 : ");
//		builder.append(major);		
//		builder.append("]");
//		return builder.toString();
//	}
	
}
