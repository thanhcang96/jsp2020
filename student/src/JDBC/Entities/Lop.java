package JDBC.Entities;

import java.util.Scanner;

public class Lop {
	private String maLop;
	private String tenLop;
	public Lop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lop(String maLop, String tenLop) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public void inputLop()
	{
		Scanner inputMalop = new Scanner(System.in);
		System.out.println("Nhap ma lop:");
		maLop = inputMalop.nextLine();
		Scanner inputTenlop = new Scanner(System.in);
		System.out.println("Nhap ten lop:");
		tenLop = inputTenlop.nextLine();
	}
	public void outputLop()
	{
		System.out.printf("%-10s %-10s \n",maLop,tenLop);
	}
}
