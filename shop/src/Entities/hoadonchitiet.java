package Entities;

public class hoadonchitiet {
	private int idHoaDonChiTiet;
	private int idHoaDon;
	private int idSanPham;
	private int soLuongMua;
	private int giaDat;
	public hoadonchitiet(int idHoaDonChiTiet, int idHoaDon, int idSanPham, int soLuongMua, int giaDat) {
		super();
		this.idHoaDonChiTiet = idHoaDonChiTiet;
		this.idHoaDon = idHoaDon;
		this.idSanPham = idSanPham;
		this.soLuongMua = soLuongMua;
		this.giaDat = giaDat;
	}
	public hoadonchitiet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdHoaDonChiTiet() {
		return idHoaDonChiTiet;
	}
	public void setIdHoaDonChiTiet(int idHoaDonChiTiet) {
		this.idHoaDonChiTiet = idHoaDonChiTiet;
	}
	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public int getIdSanPham() {
		return idSanPham;
	}
	public void setIdSanPham(int idSanPham) {
		this.idSanPham = idSanPham;
	}
	public int getSoLuongMua() {
		return soLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}
	public int getGiaDat() {
		return giaDat;
	}
	public void setGiaDat(int giaDat) {
		this.giaDat = giaDat;
	}
}
