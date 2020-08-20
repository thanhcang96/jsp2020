package Collection;

import java.util.TreeSet;
public class main {
	public static void main(String[] args) {
		SetTreeSet ts = new SetTreeSet();
		TreeSet<Integer> treeset1 = new TreeSet<>();
		TreeSet<Integer> treeset2 = new TreeSet<>();
		TreeSet<Student> students1 = new TreeSet<>();
		TreeSet<Student> students2 = new TreeSet<>();
		ts.insert1(treeset1);
		ts.insert2(treeset2);
		for (Integer item1 : treeset1) {
			System.out.println(item1);
		}
		System.out.println("------------------------------");
		for (Integer item2 : treeset2) {
			System.out.println(item2);
		}
		System.out.println("---------------------------------");
		ts.insert3(students1);
		for (Student student : students1) {
			System.out.println(student.toString());
		}
	}
}
