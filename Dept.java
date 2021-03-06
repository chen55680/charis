package orm;

import java.io.Serializable;

//此類別對應到資料庫表格
public class Dept implements Serializable{
	
	private int deptno;
	private int dname;
	private int loc;

	public Dept() {
		
	}
	
	public Dept(int deptno,String dname,String loc) {
		this.deptno=deptno;
		this.dname=dname;
		this.loc=loc;
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


}
