package jdbc.procedure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JdbcDeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
//		builder.append(super.toString());
		builder.append("\n");
		builder.append(" 1. 부서번호 : ");
		builder.append(deptno + "\n");
		builder.append(" 2. 부서명 : ");
		builder.append(dname + "\n");		
		builder.append(" 3. 근무지 : ");
		builder.append(loc + "\n");		
		return builder.toString();
	}
}
