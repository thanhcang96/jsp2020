package StudentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import btInterface.News;

public class main {
	public static List<Student> studentList = new ArrayList<>();
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Student st = new Student();
		System.out.println("1.Nhap thong tin");
		System.out.println("2.In");
		System.out.println("3.Tim kiem");
		System.out.println("4.thoat");
		int cn = 0;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Nhap chuc nang thuc hien: ");
			cn = input.nextInt();
			switch (cn) {
			case 1:
				st.createStudent(studentList);
				break;
			case 2:
				st.viewStudents(studentList);
				break;
			case 3:
				Scanner inputClass = new Scanner(System.in);
				System.out.println("Nhap lop can tim kiem:");
				String _class = inputClass.nextLine();
				st.searchStudent(studentList, _class);
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (cn != 4);	
	}
}
