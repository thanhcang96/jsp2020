package datn.shopphukien.dao.adminDao;

import java.sql.Connection;
import java.util.List;

import datn.shopphukien.beans.HoaDon;

public interface IHoaDonDao {
	List<HoaDon> getAllHoaDon(Connection conn);
	void themHoaDon(Connection conn, HoaDon hoadon);
	void suaHoaDon(Connection conn, HoaDon hoadon);
	void xoaHoaDon(Connection conn, HoaDon hoadon);
}
