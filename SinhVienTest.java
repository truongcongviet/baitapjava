package QuanLySinhVien;

import java.util.Scanner;

public class SinhVienTest {

    public static void menu() {
        System.out.println("-----------------------------------");
        System.out.println("HỆ THỐNG QUẢN LÝ SINH VIÊN");
        System.out.println("1. Nhập một sinh viên mới");
        System.out.println("2. Xem danh sách sinh viên");
        System.out.println("3. Sắp xếp danh sách theo thứ tự tăng dần tổng điểm");
        System.out.println("4. Kiểm tra xem danh sách đã sắp xếp hay chưa");
        System.out.println("5. Sửa tên sinh viên có mã nhập từ bàn phím");
        System.out.println("6.  Xóa tên sv dựa vào mã SV");
        System.out.println("7. Chèn 1 SV vào danh sách đã sắp xếp nhưng vẫn bảo tồn tính sắp xếp");
        System.out.println("8. Kết thúc và in ra chuỗi danh sách sinh viên");
        System.out.println("-----------------------------------");

    }

    public static void main(String[] args) {

        int number;
        menu();
        ClassSinhVien sv = new ClassSinhVien();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Mời bạn chọn mục: ");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    sv.addSinhVien(new SinhVien());
                    break;
                case 2:
                    sv.displaySinhVien();
                    break;
                case 3:
                    sv.SapXepSinhVien();
                case 8:
                    return;
            }
        }
    }
}
