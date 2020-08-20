package datn.shopphukien.beans;

public class LoaiSanPham {
	private int idLoaiSP;
	private String tenLoaiSP;
	public LoaiSanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiSanPham(int idLoaiSP, String tenLoaiSP) {
		super();
		this.idLoaiSP = idLoaiSP;
		this.tenLoaiSP = tenLoaiSP;
	}
	public LoaiSanPham(String tenLoaiSP) {
		super();
		this.tenLoaiSP = tenLoaiSP;
	}
	public int getIdLoaiSP() {
		return idLoaiSP;
	}
	public void setIdLoaiSP(int idLoaiSP) {
		this.idLoaiSP = idLoaiSP;
	}
	public String getTenLoaiSP() {
		return tenLoaiSP;
	}
	public void setTenLoaiSP(String tenLoaiSP) {
		this.tenLoaiSP = tenLoaiSP;
	}
}
