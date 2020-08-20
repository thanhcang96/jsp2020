package datn.shopphukien.beans;

public class ChiTietHoaDon {
	private int idCTHD;
	private int idHoadon;
	private int idSanPham;
	private int soluong;
	private int giadat;
	public ChiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChiTietHoaDon(int idHoadon, int idSanPham, int soluong, int giadat) {
		super();
		this.idHoadon = idHoadon;
		this.idSanPham = idSanPham;
		this.soluong = soluong;
		this.giadat = giadat;
	}
	public ChiTietHoaDon(int idCTHD, int idHoadon, int idSanPham, int soluong, int giadat) {
		super();
		this.idCTHD = idCTHD;
		this.idHoadon = idHoadon;
		this.idSanPham = idSanPham;
		this.soluong = soluong;
		this.giadat = giadat;
	}
	public int getIdCTHD() {
		return idCTHD;
	}
	public void setIdCTHD(int idCTHD) {
		this.idCTHD = idCTHD;
	}
	public int getIdHoadon() {
		return idHoadon;
	}
	public void setIdHoadon(int idHoadon) {
		this.idHoadon = idHoadon;
	}
	public int getIdSanPham() {
		return idSanPham;
	}
	public void setIdSanPham(int idSanPham) {
		this.idSanPham = idSanPham;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGiadat() {
		return giadat;
	}
	public void setGiadat(int giadat) {
		this.giadat = giadat;
	}
}
