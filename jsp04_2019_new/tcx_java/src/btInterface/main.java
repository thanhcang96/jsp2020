package btInterface;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main implements INews{
	public static ArrayList<Integer> rate = new ArrayList<Integer>();
	public static News _new = null;
	public static float Calculate(ArrayList<Integer> list)
	{
		double _rate = 0;
		int size = list.size();
		for (Integer item : list) {
			_rate = _rate + item;
		}
		return (float) (_rate/size);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Nhap thong tin");
		System.out.println("2.In");
		System.out.println("3.trung binh");
		System.out.println("4.thoat");
		
		int cn = 0;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Nhap chuc nang thuc hien: ");
			cn = input.nextInt();
			switch (cn) {
			case 1:
				System.out.println("Nhap ID");
				Scanner inputID = new Scanner(System.in);
				int id = inputID.nextInt();
				System.out.println("Nhap title");
				Scanner inputTitle = new Scanner(System.in);
				String title = inputTitle.nextLine();
				System.out.println("Nhap publisDate");
				Scanner inputPublishDate = new Scanner(System.in);
				String publishDate = inputPublishDate.nextLine();
				System.out.println("Nhap author");
				Scanner inputAuthor = new Scanner(System.in);
				String author = inputAuthor.nextLine();
				System.out.println("Nhap content");
				Scanner inputContent = new Scanner(System.in);
				String content = inputContent.nextLine();
				for (int i = 0; i < 3; i++) {
					Scanner inputRate = new Scanner(System.in);
					System.out.println("Nhap rate "+ i+1);
					int _rate = inputRate.nextInt();
					rate.add(_rate);
				}
				float averageRate = Calculate(rate);
				_new = new News(id,title,publishDate,author,content,averageRate);
				break;
			case 2:
				System.out.println("id: "+_new.getId()+" title"+_new.getTitle()+"publishDate "+_new.getPublishDate()+" author "+_new.getAuthor()+" content "+_new.getContent()+" rate "+_new.getAverageRate());
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (cn != 4);	
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("id: "+_new.getId()+" title"+_new.getTitle()+"publishDate "+_new.getPublishDate()+" author "+_new.getAuthor()+" content "+_new.getContent()+" rate "+_new.getAverageRate());
	}

}
