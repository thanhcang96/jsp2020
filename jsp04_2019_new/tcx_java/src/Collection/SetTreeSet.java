package Collection;

import java.util.TreeSet;

public class SetTreeSet {
	public void insert1(TreeSet<Integer> treeSet)
	{
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(5);
	}
	public void insert2(TreeSet<Integer> treeSet)
	{
		treeSet.add(9);
		treeSet.add(3);
		treeSet.add(7);
		treeSet.add(5);
		treeSet.add(9);
	}
	
	public void insert3(TreeSet<Student> treeSet)
	{
		Student st1 = new Student("Thanh Cang",24,5);
		Student st2 = new Student("Hoang",22,5);
		Student st3 = new Student("aaa",26,6);
		Student st4 = new Student("bbb",27,5);
		Student st5 = new Student("ccc",28,8);
		treeSet.add(st1);
		treeSet.add(st2);
		treeSet.add(st3);
		treeSet.add(st4);
		treeSet.add(st5);
	}
	
	
}
