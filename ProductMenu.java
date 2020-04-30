package Product;

import java.util.Scanner;

public class ProductMenu {
    
    public static void menu() {
        System.out.println("================================");
        System.out.println("1. Nhập thông tin có sản phẩm. ");
        System.out.println("2. Hiển THị thông tin");
        System.out.println("3. Sắp xếp thông tin giảm dần theo giá và hiển thị.");
        System.out.println("4. thoát.");
        System.out.println("=================================");
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        Product pd = new Product();
        while (true) {
            System.out.println("Nhập vị trí cần chạy lệnh: ");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    pd.input(pd);
                    break;
                case 2:
                    pd.output();
                    break;
                case 3:
                    pd.SapXep(pd);
                    break;
                case 4:
                    return;
            }
        }
    }
}
