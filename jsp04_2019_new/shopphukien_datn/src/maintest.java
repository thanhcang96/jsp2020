import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import datn.shopphukien.beans.LoaiSanPham;
import datn.shopphukien.connect.ConnectionUntils;
import datn.shopphukien.impl.admin.LoaiSanPhamDaoImlp;

public class maintest {

	public static void main(String[] args) {
		Connection conn;
		try {
			conn = ConnectionUntils.getMySQLConnection();
			LoaiSanPhamDaoImlp daoImlp = new LoaiSanPhamDaoImlp();
			//System.out.println(daoImlp.getAllLoaiSP(conn).size());
			LoaiSanPham lsp = daoImlp.timLoaiSP(conn, 2);
			System.out.println(lsp.getIdLoaiSP());
			System.out.println(lsp.getTenLoaiSP());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
