package datn.shopphukien.dao.userDao;

import java.sql.Connection;
import java.util.List;

import datn.shopphukien.beans.SanPham;

public interface ISanPhamDao {
	List<SanPham> getAllSanPham(Connection conn);
	void themSP (Connection conn, SanPham sanpham);
	void suaSP (Connection conn, SanPham sanpham);
	void xoaSP (Connection conn, SanPham sanpham);
}
