package probono.view;

import java.util.ArrayList;

import probono.model.dto.ProbonoProject;

public class EndView {
	
	//특정 프로젝트 출력 
	public static void projectView(ProbonoProject project){
		System.out.println(project);		
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
}





