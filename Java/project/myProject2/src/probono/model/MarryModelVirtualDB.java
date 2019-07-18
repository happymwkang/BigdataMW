//DB가 없는 관계로 test용 데이터 제공 클래스
package probono.model;

import java.util.ArrayList;

import probono.model.dto.Man;
import probono.model.dto.Marry;
import probono.model.dto.MarryProject;
import probono.model.dto.Women;

public class MarryModelVirtualDB {
	private static MarryModelVirtualDB instance = new MarryModelVirtualDB();
	private ArrayList<MarryProject> requsterList = new ArrayList<MarryProject>();
	
	
	private MarryModelVirtualDB() {
		requsterList.add(new MarryProject("강민웅", 
											new Man("강민웅", 32, "경영컨설팅", "서울", 183, 74, 1, "빨리 자리잡고 싶어요","남"), 
											new Women("나성희", 34, "강사", "서울", 163, 50, 1, "강민웅 만나고 싶어요","여"), 
											new Marry(0, 0)));
		
		requsterList.add(new MarryProject("나과속", 
											new Man("나과속", 35, "부자아빠아들", "서울", 168, 85, 1, "혼전애셋","남"), 
											new Women("나순수", 30, "사회복지사", "서울", 161, 60, 1, "아무고토 몰라여","여"), 
											new Marry(0, 0)));
		
		requsterList.add(new MarryProject("노관심", 
											new Man("노관심", 35, "의사", "대구", 177, 76, 1, "아무나 괜찮음","남"), 
											new Women("나계산", 28, "회계사", "서울", 170, 55, 1, "계산 빨라여","여"), 
											new Marry(0, 0)));
	}
	
	public static MarryModelVirtualDB getInstance() {
		return instance;
	}
	public ArrayList<MarryProject> getRequsterList(){
		return requsterList;
	}
	public void insertRrequster(MarryProject newRrequster) {
		requsterList.add(newRrequster);
	}
}





