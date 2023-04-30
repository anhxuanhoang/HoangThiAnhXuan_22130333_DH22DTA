package BT19;

import java.util.Random;

public class Subject {
	private String ten, maMonHoc;
	private double diem;
	public Subject(String ten, String maMonHoc, double diem) {
		super();
		this.ten = ten;
		this.maMonHoc = maMonHoc;
		Random rd = new Random();
		this.diem = rd.nextDouble(10
				);
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMaMonHoc() {
		return maMonHoc;
	}
	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	

}