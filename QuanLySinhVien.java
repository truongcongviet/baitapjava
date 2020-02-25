/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongcongviet;

import java.util.Scanner;


public class QuanLySinhVien {
    public static void main(String[] args) {
        double dtb;
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập Họ và tên sinh viên:");
            String hoVaTen = sc.nextLine();
            System.out.println(" Nhập mã lớp: ");
            String maLop = sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String diaChi = sc.nextLine();
            System.out.println(" Điểm Môn C, C++ , Java :");
            double c = sc.nextDouble(); 
            double cPlus = sc.nextDouble();
            double java = sc.nextDouble();
        System.out.println("Điểm trung Bình");
            dtb = ((c + cPlus + java)/3);
            if (dtb>=1&&dtb<5){
                System.out.println(dtb + " học sinh yếu");
            }else if (dtb>=5&&dtb<7) {
                System.out.println(dtb + "học sinh trunng bình");
            }else if (dtb>=7&& dtb<9){
                System.out.println(dtb+ "học sinh khá");
            }else {
                System.out.println(dtb + " học sinh xuất ");
            }
    }
}
