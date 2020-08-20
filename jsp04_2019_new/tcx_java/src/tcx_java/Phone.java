package tcx_java;

import java.util.List;

public abstract class Phone {
	abstract void insertPhone(List<info> PhoneList, String name, String phone);
	abstract void removePhone(List<info> PhoneList,String name);
	abstract void updatePhone(List<info> PhoneList,String name, String newphone);
	abstract void searchPhone(List<info> PhoneList,String name);
	abstract void sort();
}
