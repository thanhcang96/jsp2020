package datn.shopphukien.dao.adminDao;

import java.sql.Connection;
import java.util.List;

import datn.shopphukien.beans.LoaiSanPham;

public interface ILoaiSanPhamDao {
	List<LoaiSanPham> getAllLoaiSP(Connection conn);
	void themLoaiSP(Connection conn, LoaiSanPham loaisp);
	void suaLoaiSP(Connection conn, LoaiSanPham loaisp);
	void xoaLoaiSP(Connection conn, int id);
	LoaiSanPham timLoaiSP(Connection conn, int id);
}
