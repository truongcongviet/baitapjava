package QuanLySinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import QuanLySinhVien.SinhVien;
import java.util.Scanner;

public class ClassSinhVien {

    ArrayList<SinhVien> ListSinhVien = new ArrayList<SinhVien>();
    Scanner sc = new Scanner(System.in);

    private float toan;

    public void addSinhVien(SinhVien sv) {
        System.out.print("Mời nhập tên SV: ");
        sv.hoten = sc.nextLine();
        if (sv.hoten.equals("")) {
            sv.hoten = sc.nextLine();
        }
        System.out.print("Nhập mã SV: ");
        sv.maSV = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        sv.gioiTinh = sc.nextBoolean();
        if (sv.gioiTinh == true) {
            System.out.println("Giới tính NAM");
        } else if (sv.gioiTinh == false) {
            System.out.println("Giới tính NỮ");
        }

        System.out.print("Nhập điểm toán: ");

        sv.toan = sc.nextFloat();
        if (sv.toan < 0 || sv.toan > 10) {
            System.out.println("Điểm từ 0->10, mời nhập lại: ");
            sv.toan = sc.nextFloat();
        }

        System.out.print("Nhập điểm lý: ");
        sv.ly = sc.nextFloat();
        if (sv.ly < 0 || sv.ly > 10) {
            System.out.println("Điểm từ 0->10, mời nhập lại: ");
            sv.ly = sc.nextFloat();
        }
        System.out.print("Nhập điểm hóa: ");
        sv.hoa = sc.nextFloat();
        if (sv.hoa < 0 || sv.hoa > 10) {
            System.out.println("Điểm từ 0->10, mời nhập lại: ");
            sv.hoa = sc.nextFloat();
        }
        ListSinhVien.add(sv);
    }

    public void displaySinhVien() {
        if (ListSinhVien.isEmpty()) {
            System.out.println("Danh sách SINh VIÊN rỗng");
        } else {
            for (SinhVien sv : ListSinhVien) {
                sv.displaySinhVien();
            }
        }
    }

    public void SapXepSinhVien(SinhVien sv) {

        System.out.println("Sắp xếp SInh Viên dựa vào tổng điểm: ");
        ArrayList<SinhVien> SinhVien;
        Collections.sort(SinhVien);

	   for(SinhVien str: ListSinhVien){
			System.out.println(str);
	   }

        Collections.sort(ListSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.tongDiem.compareTo(o2.tongDiem)? 1:-1;
            }
        });
    }
}
