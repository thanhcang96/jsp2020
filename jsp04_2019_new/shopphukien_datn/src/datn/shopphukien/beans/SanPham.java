package datn.shopphukien.beans;

public class SanPham {
	private int idSanPham;
	private String tenSanPham;
	private String thongtinSP;
	private String image;
	private int giaSanPham;
	private int idloaiSP;
	private int soluongSP;
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(int idSanPham, String tenSanPham, String thongtinSP, String image, int giaSanPham, int idloaiSP,
			int soluongSP) {
		super();
		this.idSanPham = idSanPham;
		this.tenSanPham = tenSanPham;
		this.thongtinSP = thongtinSP;
		this.image = image;
		this.giaSanPham = giaSanPham;
		this.idloaiSP = idloaiSP;
		this.soluongSP = soluongSP;
	}
	public SanPham(String tenSanPham, String thongtinSP, String image, int giaSanPham, int idloaiSP, int soluongSP) {
		super();
		this.tenSanPham = tenSanPham;
		this.thongtinSP = thongtinSP;
		this.image = image;
		this.giaSanPham = giaSanPham;
		this.idloaiSP = idloaiSP;
		this.soluongSP = soluongSP;
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
	public String getThongtinSP() {
		return thongtinSP;
	}
	public void setThongtinSP(String thongtinSP) {
		this.thongtinSP = thongtinSP;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getGiaSanPham() {
		return giaSanPham;
	}
	public void setGiaSanPham(int giaSanPham) {
		this.giaSanPham = giaSanPham;
	}
	public int getIdloaiSP() {
		return idloaiSP;
	}
	public void setIdloaiSP(int idloaiSP) {
		this.idloaiSP = idloaiSP;
	}
	public int getSoluongSP() {
		return soluongSP;
	}
	public void setSoluongSP(int soluongSP) {
		this.soluongSP = soluongSP;
	}
}
