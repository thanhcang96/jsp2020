package datn.shopphukien.controler.adminsevlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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
 * Servlet implementation class LoaiSanPhamSevlet
 */
@WebServlet("/LoaiSanPhamSevlet")
public class LoaiSanPhamSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoaiSanPhamSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoaiSanPhamDaoImlp loaisp = new LoaiSanPhamDaoImlp();
		List<LoaiSanPham> loaiSPList;
		try {
			Connection conn = ConnectionUntils.getMySQLConnection();
			loaiSPList = loaisp.getAllLoaiSP(conn);
			request.setAttribute("listLoaiSP", loaiSPList);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/admin/loaisp.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
