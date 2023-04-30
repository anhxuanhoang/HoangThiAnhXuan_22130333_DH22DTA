package BT19;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

public class Student {
	public static Object getTen;
	public static Object getID;
	protected String ten;
	public  int Id;
	private Date date;
	private Subject subject;
	private ArrayList<Student> list;

	public Student(String ten, int id, Date date, Subject subject) {
		super();
		this.ten = ten;
		Id = id;
		this.date = date;
		this.subject = subject;
	}

	public String getTen() {
		return ten;
	}

	public int getId() {
		return Id;
	}

	public Date getDate() {
		return date;
	}

	public Subject getSubject() {
		return subject;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Id == other.Id && Objects.equals(date, other.date) && Objects.equals(list, other.list)
				&& Objects.equals(subject, other.subject) && Objects.equals(ten, other.ten);
	}

	public boolean addScore(int maMonHoc, double diem) {
		Student stu = timSinhVienTheoId(maMonHoc);
		if ( stu == null)
			return false;
		return stu.addScore(maMonHoc, diem);

	}

	private Student timSinhVienTheoId(int id) {
		for (Student student : list) {
			if (Student.getID.equals(id)) {
				return student;
			}
		}
		return null;
	}
	
	public double tinhDiemTB() {
		double totalPoint = 0;
		for (Student student : list) {
			totalPoint += subject.getDiem();
		}
		return totalPoint / list.size();
	}
}
