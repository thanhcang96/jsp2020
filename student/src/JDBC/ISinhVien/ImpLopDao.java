package JDBC.ISinhVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Connection.ConnectionUtils;
import JDBC.Entities.Lop;
import JDBC.ISinhViens.ILopDao;

public class ImpLopDao implements ILopDao {
	@Override
	public void insertLop(Lop lop, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into lop(l_malop,l_tenlop) values("
				+ "?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, lop.getMaLop());
			pstm.setString(2, lop.getTenLop());
			int row = pstm.executeUpdate();	
	}

	@Override
	public void delLop(String tenLop, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		String sql =" delete from lop where lop.l_tenlop="
				+ "?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, tenLop);
		int row = pstm.executeUpdate();
		System.out.println("Xoa thanh cong");
	}

	@Override
	public List<Lop> getAllLop(Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		List<Lop> lops = new ArrayList<Lop>();
		String sql = "select * from lop;";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			lops.add(new Lop(rs.getString("l_malop"),rs.getString("l_tenlop")));
		}
		return lops;
	}
	
	public List<Lop> listInsertLop()
	{
		List<Lop> lops = new ArrayList<Lop>();
		Lop _lop;
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Nhap bao nhieu lop");
		int num = inputNum.nextInt();
		for (int i = 0; i < num; i++) {
			_lop = new Lop();
			_lop.inputLop();
			lops.add(_lop);		}
		return lops;
	}

}
