package JDBC.Entities;

import java.util.Scanner;

public class SinhVien {
	private String maSV;
	private String tenSV;
	private double diem;
	private String maLop;
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String maSV, String tenSV, double diem, String maLop) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diem = diem;
		this.maLop = maLop;
	}
	public SinhVien(String maSV, String tenSV, double diem) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diem = diem;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public void inputSV()
	{
		Scanner inputMaSV = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		maSV = inputMaSV.nextLine();
		System.out.println("Nhap ten sinh vien:");
		Scanner inputTenSV = new Scanner(System.in);
		tenSV = inputTenSV.nextLine();
		Scanner inputDiem = new Scanner(System.in);
		System.out.println("Nhap diem:");
		diem = inputDiem.nextDouble();
		System.out.println("Nhap ma lop");
		Scanner inputMalop = new Scanner(System.in);
		maLop = inputMalop.nextLine();
	}
	
	public void outputSV()
	{
		System.out.printf("%-15s",maSV);
		System.out.printf("%-25s",tenSV);
		System.out.printf("%-10f",diem);
		System.out.printf("%-10s",maLop);
		System.out.println("\n");
	}
	public void outputSV1()
	{
		System.out.printf("%-15s",maSV);
		System.out.printf("%-25s",tenSV);
		System.out.printf("%-10f",diem);
		System.out.println("\n");
	}
}
