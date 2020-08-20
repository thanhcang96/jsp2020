package datn.shopphukien.dao.userDao;

import java.sql.Connection;
import java.util.List;

import datn.shopphukien.beans.ChiTietHoaDon;

public interface IChiTietHoaDonDao{
	List<ChiTietHoaDon> getAllChiTetHoaDon(Connection conn);
	void themCTHoaDon(Connection conn, ChiTietHoaDon cthoadon);
	void suaCTHoaDon(Connection conn, ChiTietHoaDon cthoadon);
	void xoaCTHoaDon(Connection conn, ChiTietHoaDon cthoadon);
}
