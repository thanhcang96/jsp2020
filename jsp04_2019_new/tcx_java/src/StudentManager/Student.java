package StudentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student implements IStudent{
	private String fullName;
	private int id;
	private String dateOfBirth;
	private String _native;
	private String _class;
	private String phoneNo;
	private int mobile;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String fullName, int id, String dateOfBirth, String _native, String _class, String phoneNo,
			int mobile) {
		super();
		this.fullName = fullName;
		this.id = id;
		this.dateOfBirth = dateOfBirth;
		this._native = _native;
		this._class = _class;
		this.phoneNo = phoneNo;
		this.mobile = mobile;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String get_native() {
		return _native;
	}

	public void set_native(String _native) {
		this._native = _native;
	}

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("FullName "+getFullName());
		System.out.println(" dateOfBirth: "+getDateOfBirth());
		System.out.println("Native: "+get_native());
		System.out.println("Class: "+get_class());
		System.out.println("PhoneNo: "+getPhoneNo());
		System.out.println("Mobile: "+getMobile());
	}
	public List<Student> createStudent(List<Student> studentList)
	{
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Nhap bao nhieu sinh vien?");
		int num = inputNum.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Nhap FullName");
			Scanner inputFullName = new Scanner(System.in);
			String fullName = inputFullName.nextLine();
			System.out.println("Nhap dob:");
			Scanner inputDob = new Scanner(System.in);
			String dob = inputDob.nextLine();
			System.out.println("Nhap native");
			Scanner inputNative = new Scanner(System.in);
			String _native = inputNative.nextLine();
			System.out.println("Nhap class");
			Scanner inputclass = new Scanner(System.in);
			String _class = inputclass.nextLine();
			System.out.println("Nhap PhoneNo");
			Scanner inputPhoneNo = new Scanner(System.in);
			String phoneNo = inputPhoneNo.nextLine();
			System.out.println("Nhap Mobile");
			Scanner inputMobile = new Scanner(System.in);
			int mobile = inputMobile.nextInt();
			Student st = new Student(fullName,i+1,dob,_native,_class,phoneNo,mobile);
			studentList.add(st);
		}
		return studentList;	
	}
	public void viewStudents(List<Student> studentList)
	{
		for (Student item : studentList) {
			item.Display();
		}
	}
	
	public void searchStudent(List<Student> studentList,String _class)
	{
		for (Student student : studentList) {
			if (student._class.equals(_class)) {
				student.Display();
			}
		}
	}
}
