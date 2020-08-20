package JDBC.Main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Connection.ConnectionUtils;
import JDBC.Entities.Lop;
import JDBC.Entities.SinhVien;
import JDBC.ISinhVien.ImpLopDao;
import JDBC.ISinhVien.ImpSinhVien;
import JDBC.ISinhViens.ILopDao;

public class MainProject {
	 public static List<SinhVien> sinhviens = new ArrayList<SinhVien>(); 
	 public static SinhVien sv = new SinhVien();
	 public static ImpLopDao iLop = new ImpLopDao();
	 public static ImpSinhVien _sv = new ImpSinhVien();
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionUtils.getMySQLConnection();
		System.out.println("1.Nhap thong tin sinh vien");
		System.out.println("2.In thong tin sinh vien");
		System.out.println("3.Xoa thong tin sinh vien");
		System.out.println("4.Them thong tin lop");
		System.out.println("5.lay thong tin lop");
		System.out.println("3.Xoa thong tin lop");
		System.out.println("7.Thoat");
		System.out.println("------------------------------------");
		int cn = 0;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Nhap chuc nang thuc hien: ");
			cn = input.nextInt();
			switch (cn) {
			case 1:
				_sv.insertSV(conn, sv);
				break;
			case 2:
				System.out.println("----------------------------------");
			    System.out.printf("%-15s","Ma sinh vien");
				System.out.printf("%-25s","Ten sinh vien" );
				System.out.printf("%-10s","Diem so");
				System.out.printf("%-10s","Ma lop");
				System.out.println("\n");
			    for (SinhVien itemSV : _sv.getAllSV(conn)) {
					itemSV.outputSV();
			    }
				break;
			case 3:
				Scanner inputName = new Scanner(System.in);
				System.out.println("Nhap ten nhan vien can xoa?");
				String name = inputName.nextLine();
				_sv.delSVByName(conn, name);
				System.out.println("----------------------------------");
			    System.out.printf("%-15s","Ma sinh vien");
				System.out.printf("%-25s","Ten sinh vien" );
				System.out.printf("%-10s","Diem so");
				System.out.printf("%-10s","Ma lop");
				System.out.println("\n");
			    for (SinhVien itemSV : _sv.getAllSV(conn)) {
					itemSV.outputSV();
			    }
				break;
			case 4:
				for (Lop itemLop: iLop.listInsertLop()) {
					iLop.insertLop(itemLop, conn);
				}
				break;
			case 5:
				for (Lop itemLop : iLop.getAllLop(conn)) {
					itemLop.outputLop();
				}
				break;
			case 6:
				Scanner inputXoa = new Scanner(System.in);
				System.out.println("Nhap ten can xoa!");
				String tenxoa = inputXoa.nextLine();
				iLop.delLop(tenxoa, conn);
				break;
			case 7:
				Scanner inputMalop = new Scanner(System.in);
				System.out.println("Nhap ma lop can tim?");
				String malop = inputMalop.nextLine();
				for (SinhVien item : _sv.getSVByMalop(conn, malop)) {
					item.outputSV1();
				}
				iLop.delLop(malop, conn);
				break;
			case 8:
				break;
			default:
				break;
			}
		} while (cn != 8);	
	}
}
