package metapersistence;

public class EmployeeData {
	
	private String fname,lname;
	private int id;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmployeeData [fname=" + fname + ", lname=" + lname + ", id=" + id + "]";
	}
	
	public EmployeeData(String fname, String lname, int id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}
	

}
