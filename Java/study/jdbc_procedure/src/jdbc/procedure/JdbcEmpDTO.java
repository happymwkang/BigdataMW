package jdbc.procedure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JdbcEmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	public JdbcEmpDTO(int empno, String ename, String job, int mgr, int sal, int comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
//		builder.append(super.toString());
		builder.append("\n");
		builder.append(" 1. 사번 : ");
		builder.append(empno + "\n");
		builder.append(" 2. 직원명 : ");
		builder.append(ename + "\n");		
		builder.append(" 3. 직무 : ");
		builder.append(job + "\n");		
		builder.append(" 4. 직속상사 : ");
		builder.append(mgr + "\n");		
		builder.append(" 5. 입사일 : ");
		builder.append(hiredate + "\n");		
		builder.append(" 6. 급여 : ");
		builder.append(sal + "\n");		
		builder.append(" 7. 커미션 : ");
		builder.append(comm + "\n");		
		builder.append(" 8. 부서번호 : ");
		builder.append(deptno + "\n");		
		return builder.toString();
	}
}
