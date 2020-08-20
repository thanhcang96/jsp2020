package Entities;

public class loaisanpham {
	private String idLoaiSanPham;
	private String tenLoaiSanPham;
	public loaisanpham(String idLoaiSanPham, String tenLoaiSanPham) {
		super();
		this.idLoaiSanPham = idLoaiSanPham;
		this.tenLoaiSanPham = tenLoaiSanPham;
	}
	public loaisanpham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdLoaiSanPham() {
		return idLoaiSanPham;
	}
	public void setIdLoaiSanPham(String idLoaiSanPham) {
		this.idLoaiSanPham = idLoaiSanPham;
	}
	public String getTenLoaiSanPham() {
		return tenLoaiSanPham;
	}
	public void setTenLoaiSanPham(String tenLoaiSanPham) {
		this.tenLoaiSanPham = tenLoaiSanPham;
	}
}
