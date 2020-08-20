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

/**
 * Servlet implementation class ThemLoaiSPSevlet
 */
@WebServlet("/ThemLoaiSP")
public class ThemLoaiSPSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemLoaiSPSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/view/admin/themloaisp.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		LoaiSanPham _loaisp = new LoaiSanPham();
		try {
			Connection conn = ConnectionUntils.getMySQLConnection();
			LoaiSanPhamDaoImlp loaisp = new LoaiSanPhamDaoImlp();
			String tenLoaisp = (String)request.getParameter("tenlsp");
			_loaisp = new LoaiSanPham(tenLoaisp);
			loaisp.themLoaiSP(conn, _loaisp);
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
