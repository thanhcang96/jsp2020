package tcx_java;

public class info {
	private String name;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public info(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+getName()+" phone: "+getPhone() ;
	}
}
