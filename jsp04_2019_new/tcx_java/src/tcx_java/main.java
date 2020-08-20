package tcx_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class main {
		public static List<info> phoneList = new ArrayList<>();
	public static void main(String[] args) {
		//Menu chuong trinh
		
		System.out.println("1.Nhap thong tin");
		System.out.println("2.Xoa thong tin theo ten");
		System.out.println("3.Sua so dien thoai");
		System.out.println("4.Nhap thong tin");
		System.out.println("5.Tim kiem theo ten");
		System.out.println("6.Sap xep");
		System.out.println("-------------------------------------");
		
		//thuc hien chuong trinh
		PhoneBooks _pb = new PhoneBooks();
		int inputNumber = 0;
		do {
			Scanner inputNum = new Scanner(System.in);
			System.out.println("Vui long chon chuc nang ban muon thuc hien");
			inputNumber = inputNum.nextInt();
			Scanner input1 = new Scanner(System.in);
			switch (inputNumber) {
			case 1:
				Scanner inputSL = new Scanner(System.in);
				System.out.println("Nhap bao nhieu thong tin?");
				int n = inputSL.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.println("Nhap name: ");
					String name = input1.nextLine();
					System.out.println("Nhap phone: ");
					String phone = input1.nextLine();
					_pb.insertPhone(phoneList ,name, phone);	
				}
				for (int i = 0; i < phoneList.size(); i++) {
					info item = phoneList.get(i);
					System.out.println("ten: "+item.getName()+" tuoi "+item.getPhone());
				}
				break;
			case 2:
				System.out.println("Nhap ten can xoa: ");
				String name = input1.nextLine();
				_pb.removePhone(phoneList ,name);
				if (phoneList.size() == 0) {
					System.out.println("Danh sach trong");
				}
				else
				{
					for (info item : phoneList) {
						System.out.println("ten: " +item.getName() +"phone: "+item.getPhone());
					}
				}		
				break;
			case 3:
				System.out.println("Nhap name: ");
				String name1 = input1.nextLine();
				System.out.println("Nhap phone: ");
				String newphone = input1.nextLine();
				_pb.updatePhone(phoneList, name1, newphone);
				for (info item : phoneList) {
					System.out.println("ten: " +item.getName() +"phone: "+item.getPhone());
				}
			case 4:
				System.out.println("Nhap name: ");
				String name2 = input1.nextLine();
				_pb.searchPhone(phoneList, name2);
				break;
			default:
				break;
			}
		}while(inputNumber != 0);
		
	}

}
