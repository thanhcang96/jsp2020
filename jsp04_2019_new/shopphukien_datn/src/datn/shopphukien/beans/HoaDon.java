package datn.shopphukien.beans;

public class HoaDon {
	private int idHoaDon;
	private String thoigian;
	private String hotenDatMua;
	private String diachiDatMua;
	private String sdtDatMua;
	private int trangthai;
	private int idTaiKhoan;
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(int idHoaDon, String thoigian, String hotenDatMua, String diachiDatMua, String sdtDatMua,
			int trangthai, int idTaiKhoan) {
		super();
		this.idHoaDon = idHoaDon;
		this.thoigian = thoigian;
		this.hotenDatMua = hotenDatMua;
		this.diachiDatMua = diachiDatMua;
		this.sdtDatMua = sdtDatMua;
		this.trangthai = trangthai;
		this.idTaiKhoan = idTaiKhoan;
	}
	public HoaDon(String thoigian, String hotenDatMua, String diachiDatMua, String sdtDatMua, int trangthai,
			int idTaiKhoan) {
		super();
		this.thoigian = thoigian;
		this.hotenDatMua = hotenDatMua;
		this.diachiDatMua = diachiDatMua;
		this.sdtDatMua = sdtDatMua;
		this.trangthai = trangthai;
		this.idTaiKhoan = idTaiKhoan;
	}
	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public String getThoigian() {
		return thoigian;
	}
	public void setThoigian(String thoigian) {
		this.thoigian = thoigian;
	}
	public String getHotenDatMua() {
		return hotenDatMua;
	}
	public void setHotenDatMua(String hotenDatMua) {
		this.hotenDatMua = hotenDatMua;
	}
	public String getDiachiDatMua() {
		return diachiDatMua;
	}
	public void setDiachiDatMua(String diachiDatMua) {
		this.diachiDatMua = diachiDatMua;
	}
	public String getSdtDatMua() {
		return sdtDatMua;
	}
	public void setSdtDatMua(String sdtDatMua) {
		this.sdtDatMua = sdtDatMua;
	}
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	public int getIdTaiKhoan() {
		return idTaiKhoan;
	}
	public void setIdTaiKhoan(int idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}
}
