package datn.shopphukien.beans;

public class TaiKhoan {
	private int idTaiKhoan;
	private String tenTaiKhoan;
	private String matkhau;
	private int phanquyen;
	private String diachi;
	private String sdt;
	private String email;
	public TaiKhoan(int idTaiKhoan, String tenTaiKhoan, String matkhau, int phanquyen, String diachi, String sdt,
			String email) {
		super();
		this.idTaiKhoan = idTaiKhoan;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matkhau = matkhau;
		this.phanquyen = phanquyen;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
	}
	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaiKhoan(String tenTaiKhoan, String matkhau, int phanquyen, String diachi, String sdt, String email) {
		super();
		this.tenTaiKhoan = tenTaiKhoan;
		this.matkhau = matkhau;
		this.phanquyen = phanquyen;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
	}
	public int getIdTaiKhoan() {
		return idTaiKhoan;
	}
	public void setIdTaiKhoan(int idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public int getPhanquyen() {
		return phanquyen;
	}
	public void setPhanquyen(int phanquyen) {
		this.phanquyen = phanquyen;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
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
