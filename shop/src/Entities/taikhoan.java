package Entities;

public class taikhoan {
	private int idTaiKhoan;
	private String tenTaihoan;
	private String matKhau;
	private int phanQuyen;
	private String hoTen;
	private String diaChi;
	private String sdt;
	private String email;
	public taikhoan(int idTaiKhoan, String tenTaihoan, String matKhau, int phanQuyen, String hoTen, String diaChi,
			String sdt, String email) {
		super();
		this.idTaiKhoan = idTaiKhoan;
		this.tenTaihoan = tenTaihoan;
		this.matKhau = matKhau;
		this.phanQuyen = phanQuyen;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.email = email;
	}
	public taikhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdTaiKhoan() {
		return idTaiKhoan;
	}
	public void setIdTaiKhoan(int idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}
	public String getTenTaihoan() {
		return tenTaihoan;
	}
	public void setTenTaihoan(String tenTaihoan) {
		this.tenTaihoan = tenTaihoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public int getPhanQuyen() {
		return phanQuyen;
	}
	public void setPhanQuyen(int phanQuyen) {
		this.phanQuyen = phanQuyen;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
