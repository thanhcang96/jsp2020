package tcx_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class PhoneBooks extends Phone {
	@Override
	void insertPhone(List<info> PhoneList, String name, String phone) {
		info _info;
		Iterator<info> item = PhoneList.iterator();
		if (PhoneList.size() == 0) {
			_info = new info(name, phone);
			PhoneList.add(_info);
		}
		else
		{
			while(item.hasNext())
			{
				if (item.next().getName().equals(name)) {
					System.out.println("Da ton tai thong tin");
				}
				else
				{
					_info = new info(name, phone);
					PhoneList.add(_info);
				}
				break;
			}
		}
	}

	@Override
	void sort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void removePhone(List<info> PhoneList, String name) {
		// TODO Auto-generated method stub
		Iterator<info> item = PhoneList.iterator();
		while (item.hasNext()) {
			if (item.next().getName().equals(name)) {
				item.remove();
				break;
			}	
		}
	}

	@Override
	void updatePhone(List<info> PhoneList, String name, String newphone) {
		// TODO Auto-generated method stub
		for (info info : PhoneList) {
			if (info.getName().equals(name) && (info.getPhone().equals(newphone))) {
				info.setPhone(newphone);
			}
		}
	}

	@Override
	void searchPhone(List<info> PhoneList, String name) {
		// TODO Auto-generated method stub
		Iterator<info> item = PhoneList.iterator();
		while(item.hasNext())
		{
			int dem = 0;
			info i = item.next();
			if (i.getName().equals(name)) {
				dem += 1;
				System.out.println(i);
			}
			if (dem == 0) {
				System.out.println("Khong ton tai thong tin can tim");
			}
			break;
		}	
	}
	
}
