package Bai04.vd1;

public class QuanLyNhanSu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien("Ngoc Truong", 2005, "IT024324",
				"Cong nghe thong tin");
		System.out.print(sv);
	
		System.out.println(sv);
		GiangVien gv = new GiangVien("Chau Dung", 1978, "GV1234", "CNTT", "ThS");
		System.out.println(gv);
	}

}
