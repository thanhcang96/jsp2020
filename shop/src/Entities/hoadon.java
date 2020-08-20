package Entities;

public class hoadon {
	private int idHoaDon;
	private String thoiGian;
	private String hoTenDatMua;
	private String diaChiDatMua;
	private int trangThai;
	private int idTaiKhoan;
	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public String getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}
	public String getHoTenDatMua() {
		return hoTenDatMua;
	}
	public void setHoTenDatMua(String hoTenDatMua) {
		this.hoTenDatMua = hoTenDatMua;
	}
	public String getDiaChiDatMua() {
		return diaChiDatMua;
	}
	public void setDiaChiDatMua(String diaChiDatMua) {
		this.diaChiDatMua = diaChiDatMua;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public int getIdTaiKhoan() {
		return idTaiKhoan;
	}
	public void setIdTaiKhoan(int idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}
	public hoadon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hoadon(int idHoaDon, String thoiGian, String hoTenDatMua, String diaChiDatMua, int trangThai,
			int idTaiKhoan) {
		super();
		this.idHoaDon = idHoaDon;
		this.thoiGian = thoiGian;
		this.hoTenDatMua = hoTenDatMua;
		this.diaChiDatMua = diaChiDatMua;
		this.trangThai = trangThai;
		this.idTaiKhoan = idTaiKhoan;
	}
}
