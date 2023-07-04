package companyy;

public class Department {
	private int deptno;
	private String dname;
	private String loc;
	
	public Department() {}
	
	public Department(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
	    String format = "| %-7s | %-15s | %-10s |\n";
	    StringBuilder sb = new StringBuilder();
	    
	    sb.append("+---------+-----------------+------------+\n");
	    sb.append("| DeptNo  | DName           | Location   |\n");
	    sb.append("+---------+-----------------+------------+\n");
	    sb.append(String.format(format, deptno, dname, loc));
	    sb.append("+---------+-----------------+------------+\n");
	    
	    return sb.toString();
	}
 
	
	
}