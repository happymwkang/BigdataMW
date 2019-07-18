package moneyLife.model.dto;

import lombok.Data;

@Data
public class InEvent extends Event{

	private int no;
	private String event;
	private int eresult;
	
	public InEvent(int no, String event, int eresult) {
		super(no, event, eresult);
	}
}
