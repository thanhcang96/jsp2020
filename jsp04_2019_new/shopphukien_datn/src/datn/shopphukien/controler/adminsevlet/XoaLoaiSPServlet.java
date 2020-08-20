package datn.shopphukien.controler.adminsevlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datn.shopphukien.beans.LoaiSanPham;
import datn.shopphukien.connect.ConnectionUntils;
import datn.shopphukien.impl.admin.LoaiSanPhamDaoImlp;

/**
 * Servlet implementation class XoaLoaiSPServlet
 */
@WebServlet("/XoaLoaiSP")
public class XoaLoaiSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XoaLoaiSPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection conn = ConnectionUntils.getMySQLConnection();
			int id = Integer.parseInt(request.getParameter("id_lsp"));
			LoaiSanPhamDaoImlp lspImlp = new LoaiSanPhamDaoImlp();
			lspImlp.xoaLoaiSP(conn, id);
			response.sendRedirect(request.getContextPath() + "/LoaiSanPhamSevlet");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
