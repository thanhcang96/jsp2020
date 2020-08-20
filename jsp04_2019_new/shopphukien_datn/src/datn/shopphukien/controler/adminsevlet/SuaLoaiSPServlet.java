package datn.shopphukien.controler.adminsevlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datn.shopphukien.beans.LoaiSanPham;
import datn.shopphukien.connect.ConnectionUntils;
import datn.shopphukien.impl.admin.LoaiSanPhamDaoImlp;
import sun.font.LayoutPathImpl;

/**
 * Servlet implementation class SuaLoaiSPServlet
 */
@WebServlet("/SuaLoaiSP")
public class SuaLoaiSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuaLoaiSPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoaiSanPham lsp = null;
		try {
			Connection conn = ConnectionUntils.getMySQLConnection();
			int id = Integer.parseInt(request.getParameter("id_lsp"));
			LoaiSanPhamDaoImlp lspImlp = new LoaiSanPhamDaoImlp();
			lsp = lspImlp.timLoaiSP(conn, id);
			request.setAttribute("edit_loaisp", lsp);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/view/admin/sualsp.jsp");
			dispatcher.forward(request, response);
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
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		LoaiSanPham _loaisp = null;
		try {
			Connection conn = ConnectionUntils.getMySQLConnection();
			LoaiSanPhamDaoImlp lspImlp = new LoaiSanPhamDaoImlp();
			int id = Integer.parseInt(request.getParameter("idlsp"));
			String tenlsp = (String)request.getParameter("tenlsp");
			_loaisp = new LoaiSanPham(id,tenlsp);
			lspImlp.suaLoaiSP(conn, _loaisp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			request.setAttribute("loaisp" , _loaisp );
			response.sendRedirect(request.getContextPath() + "/LoaiSanPhamSevlet");
	}
}
