package probono.model.dto;

import lombok.Data;

@Data
public class ProbonoProject {

	private String probonoProjectName; //진행되는 실제 플젝트 이름
	private Probono probono; //기부 내용
	private Activist activist; //기부자
	private Recipient receive; //수혜자
	private String projectContent; //재능기부 내용

	public ProbonoProject() {}
	public ProbonoProject(String probonoProjectName, Probono probono,
			Activist activist, Recipient receive, String projectContent) {
		this.probonoProjectName = probonoProjectName;
		this.probono = probono;
		this.activist = activist;
		this.receive = receive;
		this.projectContent = projectContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 프로젝트명 : ");
		builder.append(probonoProjectName);
		builder.append("\n2. 재능기부내용 : ");
		builder.append(probono);
		builder.append("\n3. 재능 기부자 정보: ");
		builder.append(activist);
		builder.append("\n4. 수혜자 정보: ");
		builder.append(receive);
		builder.append("\n5. 프로젝트제공내용 : ");
		builder.append(projectContent);
		return builder.toString(); 
	}
}
