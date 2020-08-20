package datn.shopphukien.impl.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import datn.shopphukien.beans.LoaiSanPham;
import datn.shopphukien.dao.adminDao.ILoaiSanPhamDao;
import sun.font.LayoutPathImpl;

public class LoaiSanPhamDaoImlp implements ILoaiSanPhamDao{

	@Override
	public List<LoaiSanPham> getAllLoaiSP(Connection conn) {
		// TODO Auto-generated method stub
		List<LoaiSanPham> loaispList = new ArrayList<LoaiSanPham>();
		ResultSet rs;
		try {
			
			String sql = "select * from loaisanpham;";
			PreparedStatement pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				loaispList.add(new LoaiSanPham(rs.getInt("lsp_id"),rs.getString("lsp_tenloaisp")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return loaispList;
	}

	@Override
	public void themLoaiSP(Connection conn, LoaiSanPham loaisp) {
		// TODO Auto-generated method stub
		PreparedStatement pstm;
		ResultSet rs;
		try {
			String sql = "insert into loaisanpham(lsp_tenloaisp) values "
					+ "(?);";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, loaisp.getTenLoaiSP());
			int row = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void suaLoaiSP(Connection conn, LoaiSanPham loaisp) {
		// TODO Auto-generated method stub
		try {
			String sql = "update loaisanpham set lsp_tenloaisp = ? where lsp_id = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, loaisp.getTenLoaiSP());
			pstm.setInt(2, loaisp.getIdLoaiSP());
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void xoaLoaiSP(Connection conn, int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "Delete from loaisanpham where lsp_id = "
					+ "?;";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			int row = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public LoaiSanPham timLoaiSP(Connection conn, int id) {
		LoaiSanPham loaisp = new LoaiSanPham();
		try {
			String sql = "select lsp_id,lsp_tenloaisp from loaisanpham where lsp_id = ?;";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while(rs.next())
			{
				loaisp = new LoaiSanPham(rs.getInt("lsp_id"),rs.getString("lsp_tenloaisp"));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return loaisp;
	}
}
