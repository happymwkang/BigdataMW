package probono.view;

import java.util.ArrayList;

import net.sf.json.JSONArray;
import probono.model.dto.MarryProject;

public class EndView {
	
	//특정 프로젝트 출력 
	public static void projectView(MarryProject requster){
		//JSONArray a = JSONArray.fromObject(project);
		System.out.println(requster);		
//		System.out.println(a);
	}
		
	//모든 프로젝트 출력
	public static void requsterListView(ArrayList<MarryProject> allMarryProject){
		for(int index = 0; index < allMarryProject.size(); index++){			
			System.out.println("[의뢰자 " + (index+1) + "]\n" + allMarryProject.get(index) +"\n");
		}
	}
	
	//예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}

//	public static void JSONObject(ArrayList<ProbonoProject> allProbonoProject) {
//		for(int index = 0; index < allProbonoProject.size(); index++){			
//				JSONArray r =  JSONArray.fromObject(allProbonoProject.get(index));
//				System.out.println(r);
//				
//		}
//	}
}





