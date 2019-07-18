package probono.view;

import java.util.ArrayList;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import probono.model.dto.ProbonoProject;

public class EndView {
	
	//특정 프로젝트 출력 
	public static void projectView(ProbonoProject project){
		JSONArray a = JSONArray.fromObject(project);
		//System.out.println(project);		
		System.out.println(a);	
	}
		
	//모든 프로젝트 출력
	public static void projectListView(ArrayList<ProbonoProject> allProbonoProject){
		for(int index = 0; index < allProbonoProject.size(); index++){			
			System.out.println("[프로젝트 " + (index+1) + "]\n" + allProbonoProject.get(index) +"\n");
		}
	}
	
	//예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}
	
	public static void JSONObject(ArrayList<ProbonoProject> allProbonoProject) {
		for(int index = 0; index < allProbonoProject.size(); index++){			
				JSONArray r =  JSONArray.fromObject(allProbonoProject.get(index));
				System.out.println(r);
				
		}
	}
	
//	public static void JSONObject(){
//	JSONObject jsonObject = new JSONObject();
//	JSONObject data = new JSONObject();
//	ArrayList a = new ArrayList<>(); 
//	ProbonoProject p = new ProbonoProject();
//	JSONObject probonoProject = new JSONObject();
//	
//	a.add(p.getProbonoProjectName());
//	probonoProject.put("프로젝트명", a);
//	
//	
////	data.put("ProbonoProject", p.getProbonoProjectName());
////	data.put("Probono", p.getProbono());
////	data.put("activist", p.getActivist());
////	data.put("receive", p.getReceive());
//	
//	JSONArray r =  JSONArray.fromObject(probonoProject);
//	System.out.println("테스트로 찍어봤다" + r);

}





