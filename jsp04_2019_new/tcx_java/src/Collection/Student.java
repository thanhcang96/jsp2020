package Collection;

public class Student implements Comparable<Student>{
	private String fullName;
	private int age;
	private double score;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String fullName, int age, double score) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.score = score;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public int compareTo(Student _student) {
		// TODO Auto-generated method stub
		return this.getFullName().compareTo(_student.getFullName());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FullName: "+this.fullName +"--- age: "+this.age+"---score: "+this.score;
	}
	
}
