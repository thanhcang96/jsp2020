package JDBC.ISinhVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Connection.ConnectionUtils;
import JDBC.ISinhViens.ISinhVien;
import JDBC.Entities.SinhVien;

public class ImpSinhVien implements ISinhVien {

	@Override
	public void delSVByName(Connection conn, String name) throws SQLException {
		String sql = "delete from sinhvien where sinhvien.sv_tensv="
				+"?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, name);
		int row  = pstm.executeUpdate();
	}

	@Override
	public List<SinhVien> getAllSV(Connection conn) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<SinhVien> sinhviens = new ArrayList<SinhVien>();
		String sql = "select * from sinhvien;";
		PreparedStatement pStatement = conn.prepareStatement(sql);
		ResultSet rs = pStatement.executeQuery();
		while (rs.next()) {
			sinhviens.add(new SinhVien(rs.getString("sv_masv"),rs.getString("sv_tensv"),rs.getDouble("sv_diem"),rs.getString("l_malop")));
		}
		return sinhviens;
	}
	@Override
	public void insertSV(Connection conn,SinhVien sv) throws ClassNotFoundException, SQLException {
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Nhap bao nhieu sinh vien?");
		int num = inputNum.nextInt();
		for (int i = 0; i < num; i++) {
			sv.inputSV();
			String sql = "insert into sinhvien(sv_masv,sv_tensv,sv_diem,l_malop) values (?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1,sv.getMaSV());
			pstm.setString(2, sv.getTenSV());
			pstm.setDouble(3, sv.getDiem());
			pstm.setString(4, sv.getMaLop());
			int row = pstm.executeUpdate();
		}
	}

	@Override
	public List<SinhVien> getSVByMalop(Connection conn, String malop) {
		// TODO Auto-generated method stub
		List<SinhVien> sinhvienByMalops = new ArrayList<SinhVien>();
		ResultSet rs ;
		PreparedStatement pstm;
		try {
			String sql = "select sinhvien.sv_masv,sinhvien.sv_tensv,sinhvien.sv_diem from sinhvien where sinhvien.l_malop="
					+ "?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, malop);
			rs = pstm.executeQuery();
			while (rs.next()) {
				sinhvienByMalops.add(new SinhVien(rs.getString("sv_masv"),rs.getString("sv_tensv"),rs.getDouble("sv_diem")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return sinhvienByMalops;
	}

}
