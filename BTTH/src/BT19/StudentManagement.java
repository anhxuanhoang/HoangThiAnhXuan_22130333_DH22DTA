package BT19;
import java.util.ArrayList;

public class StudentManagement {
	private static final Subject subject = null;
	private ArrayList<Student> list;

	public StudentManagement() {
		super();
		this.list = new ArrayList<Student>();
	}

	public StudentManagement(ArrayList<Student> list) {
		super();
		this.list = list;
	}
		
	public boolean themSinhVien(Student sVien) {
		return this.list.add(sVien);
	}

	public boolean themDiem(String TenSV, int maMonHoc, double diem) {
		Student stu = timSinhVienTheoId(maMonHoc);
		if (stu == null)
			return false;
		return stu.addScore(maMonHoc, diem);
	}

	public Student timSinhVienTheoTen(String ten) {
		for (Student student : list) {
			if (Student.getTen.equals(ten)) {
				return student;
			}
		}
		return null;
	}

	public Student timSinhVienTheoId(int id) {
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

	public void display() {
//		System.out.println("******************");
		for (Student student : list) {
			System.out.println("-------------------------------------------");
			System.out.println("Ten" + student.getTen() + "\nMSSV: " + student.getId() + "\nDiem Trung Binh: "
					+ student.tinhDiemTB());
		}
	}

	public void sort() {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size(); j++) {
				Double score1 = list.get(i).tinhDiemTB();
				Double score2 = list.get(j).tinhDiemTB();
				if (score1.compareTo(score2) > 0) {
					Student stu = list.remove(j);
					list.add(i, stu);
				} else if (score1.compareTo(score2) == 0) {
					String name1 = list.get(i).getTen();
					String name2 = list.get(j).getTen();
					if (name1.compareTo(name2) > 9) {
						Student stu = list.remove(j);
						list.add(i, stu);
					}
				}
			}
		}

	}

	public static void main(String[] args) {
	StudentManagement manage = new  StudentManagement();
	ArrayList<Subject> listSubject1 = new ArrayList<Subject>();
	Subject subject1_list1 = new Subject("sub1", "subject1", 9);
	Subject subject1_list2 = new Subject("sub2", "subject2", 0);
	listSubject1.add(subject1_list1);
	listSubject1.add(subject1_list2);

	ArrayList<Subject> listSubject2 = new ArrayList<Subject>();
	Subject subject2_list1 = new Subject("sub3", "subject3", 0);
	Subject subject2_list2 = new Subject("sub4", "subject4", 0);
	listSubject2.add(subject2_list1);
	listSubject2.add(subject2_list2);

	ArrayList<Subject> listSubject3 = new ArrayList<Subject>();
	Subject subject3_list1 = new Subject("sub5", "subject5", 0);
	Subject subject3_list2 = new Subject("sub6", "subject6", 0);
	listSubject3.add(subject3_list1);
	listSubject3.add(subject3_list2);

	ArrayList<Student> listStudent1 = new ArrayList<Student>();
	Student stu1_list1 = new Student("Nguyen Van A", 01, null, subject1_list1);
	Student stu1_list2 = new Student("Nguyen B", 02, null, subject2_list1);
	listStudent1.add(stu1_list1);
	listStudent1.add(stu1_list2);

	ArrayList<Student> listStudent2 = new ArrayList<Student>();
	Student stu2_list1 = new Student("Pham An", 03, null, subject3_list1);
	Student stu2_list2 = new Student("Phan Anh", 04, null, subject3_list2);
	listStudent2.add(stu2_list1);
	listStudent2.add(stu2_list2);
		manage.display();
		//System.out.println(manage.themSinhVien(null));
}
}
