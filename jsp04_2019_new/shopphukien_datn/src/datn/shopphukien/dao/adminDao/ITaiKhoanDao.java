package datn.shopphukien.dao.adminDao;

import java.sql.Connection;
import java.util.List;

import datn.shopphukien.beans.TaiKhoan;

public interface ITaiKhoanDao {
	List<TaiKhoan> getAllTK(Connection conn);
	void themTk(Connection conn, TaiKhoan taikhoan);
	void suaTK(Connection conn, TaiKhoan taikhoan);
	void xoaTK(Connection conn, TaiKhoan taikhoan);
}
