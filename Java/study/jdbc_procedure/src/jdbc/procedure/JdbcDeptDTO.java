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
		builder.append(" 1. �μ���ȣ : ");
		builder.append(deptno + "\n");
		builder.append(" 2. �μ��� : ");
		builder.append(dname + "\n");		
		builder.append(" 3. �ٹ��� : ");
		builder.append(loc + "\n");		
		return builder.toString();
	}
}
