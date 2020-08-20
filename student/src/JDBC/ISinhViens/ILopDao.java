package JDBC.ISinhViens;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import JDBC.Entities.Lop;

public interface ILopDao {
	void insertLop(Lop lop, Connection conn) throws SQLException;
	void delLop(String tenLop, Connection conn) throws SQLException;
	List<Lop> getAllLop(Connection conn) throws SQLException;
}
