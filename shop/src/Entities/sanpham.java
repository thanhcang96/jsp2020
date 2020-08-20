package Entities;

public class sanpham {
	private int idSanPham;
	private String tenSanPham;
	private String thongTinSanPham;
	private String anh;
	private int giaBan;
	private String idLoaiSanPham;
	private int soLuongCon;
	public sanpham(int idSanPham, String tenSanPham, String thongTinSanPham, String anh, int giaBan,
			String idLoaiSanPham, int soLuongCon) {
		super();
		this.idSanPham = idSanPham;
		this.tenSanPham = tenSanPham;
		this.thongTinSanPham = thongTinSanPham;
		this.anh = anh;
		this.giaBan = giaBan;
		this.idLoaiSanPham = idLoaiSanPham;
		this.soLuongCon = soLuongCon;
	}
	public sanpham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdSanPham() {
		return idSanPham;
	}
	public void setIdSanPham(int idSanPham) {
		this.idSanPham = idSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getThongTinSanPham() {
		return thongTinSanPham;
	}
	public void setThongTinSanPham(String thongTinSanPham) {
		this.thongTinSanPham = thongTinSanPham;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	public String getIdLoaiSanPham() {
		return idLoaiSanPham;
	}
	public void setIdLoaiSanPham(String idLoaiSanPham) {
		this.idLoaiSanPham = idLoaiSanPham;
	}
	public int getSoLuongCon() {
		return soLuongCon;
	}
	public void setSoLuongCon(int soLuongCon) {
		this.soLuongCon = soLuongCon;
	}
	
}
