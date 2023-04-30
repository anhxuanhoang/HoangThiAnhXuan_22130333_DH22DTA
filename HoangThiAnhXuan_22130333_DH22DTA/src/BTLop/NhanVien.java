package BTLop;

public class NhanVien {
	protected int maNV;
	protected String tenNv;
	private String trinhDo;
	private double luongCoBan;

	public NhanVien(int maNV, String tenNv, String trinhDo, double luongCoBan) {
		super();
		this.maNV = maNV;
		this.tenNv = tenNv;
		this.trinhDo = trinhDo;
		this.luongCoBan = luongCoBan;
	}


	public double getLuongCoBan() {
		return luongCoBan;
	}

	public static class QuanLy extends NhanVien {
		private String chuyenMon;
		private int phuCapChucVu;

		public QuanLy(int maNV, String tenNv, String trinhDo, double luongCoBan, String chuyenMon, int phuCapChucVu) {
			super(maNV, tenNv, trinhDo, luongCoBan);
			this.chuyenMon = chuyenMon;
			this.phuCapChucVu = phuCapChucVu;
		}

		public double luong() {
			return this.getLuongCoBan() + this.phuCapChucVu;
		}
	}

	public static class NghienCuu extends NhanVien {
		private int phuCapDocHai;

		public NghienCuu(int maNV, String tenNv, String trinhDo, double luongCoBan, int phuCapDocHai) {
			super(maNV, tenNv, trinhDo, luongCoBan);
			this.phuCapDocHai = phuCapDocHai;
		}

		public double luong() {
			return this.getLuongCoBan() + this.phuCapDocHai;
		}
	}

	public static class PhucVu extends NhanVien {
		public PhucVu(int maNV, String tenNv, String trinhDo, double luongCoBan) {
			super(maNV, tenNv, trinhDo, luongCoBan);
			}

		public double luong() {
			return this.getLuongCoBan();
		}
	}


	// Tao 3 nhan vien
	public static void main(String[] args) {
		QuanLy ql = new QuanLy(01, "Nguyễn Văn A", "Trưởng phòng", 5000.0, "Lập trình", 500);
		NghienCuu nc = new NghienCuu(02, "Pham Van Dong", "Pho Phong", 4500.0, 200);
		PhucVu pv = new PhucVu(03, "Nguyen Thi Anh", "phuc vu", 1000);

		System.out.println("Luong cua " + ql.tenNv + ":" + ql.luong());
		System.out.println("Lương của " + nc.tenNv + ":" + nc.luong());
		System.out.println("Luong cua " + pv.tenNv + ":" + pv.luong());

	
	}

}
