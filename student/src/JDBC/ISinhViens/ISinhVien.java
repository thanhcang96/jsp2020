package JDBC.ISinhViens;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import JDBC.Entities.SinhVien;

public interface ISinhVien {
	void insertSV(Connection conn,SinhVien sv) throws ClassNotFoundException, SQLException;
	List<SinhVien> getAllSV(Connection conn) throws ClassNotFoundException, SQLException;
	void delSVByName(Connection conn,String name) throws SQLException;
	List<SinhVien> getSVByMalop (Connection conn,String name);
}
