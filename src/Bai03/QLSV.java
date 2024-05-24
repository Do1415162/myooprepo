package Bai03;

public class QLSV {

	public static void main(String[] args) {
		// Khai báo đối tượng
		SinhVien  sv;
		sv = new SinhVien();
		//Gắn các đối tượng sinh viên
		sv.hoten = "Dinh Do";
		sv.Namsinh =2005;
		sv.SDT = "0335911508";
		System.out.println("hoten:" + sv.hoten + "namsinh" + sv.Namsinh + "sdt" + sv.SDT);

	}

}
