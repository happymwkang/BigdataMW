package moneyLife.model.dto;

import lombok.Data;

@Data
public class Event {

	private int no;
	private String event;
	private int eresult;
	
	public Event() {}
	public Event(int no, String event, int eresult) {
		this.no = no;
		this.eresult = eresult;
		this.event = event;
	}
	
}
