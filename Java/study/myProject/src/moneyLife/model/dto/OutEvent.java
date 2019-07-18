package moneyLife.model.dto;

import lombok.Data;

@Data
public class OutEvent extends Event{

	private int no;
	private String event;
	private int eresult;
	
	public OutEvent(int no, String event, int eresult) {
		super(no, event, eresult);
	}
	
	public void EventOccur() {
		Event out = new OutEvent(no, event, eresult);
	}
}
