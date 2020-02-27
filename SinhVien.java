/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongcongviet;

import java.util.Scanner;


public class SinhVien {
    private int age;
    private String name, address, xepLoai;
    private double cPoint,javaPoint, cPlus;
    
    
    
public boolean checkpoint (double dieminput){
    if(dieminput<0||dieminput>10){
        return false;
    }else 
        return true;
}
    
    
    public SinhVien (){
  
    }
    public double dtb(){
        return (cPlus + cPoint +javaPoint)/3;
    }
    
    public void insertInformation (){
        System.out.println("Nhập Thông tin học viên ");
        System.out.println("--------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Tên: ");
        name = sc.nextLine();
        System.out.println(" Địa Chỉ: ");
        address = sc.nextLine();
        System.out.println(" tuổi: ");
        age = sc.nextInt();
   
        boolean xcheckpoint;
        
        do {
            System.out.println("nhập điểm môn C:");
            cPoint = sc.nextDouble();
            xcheckpoint = checkpoint(cPoint);
        }while(!xcheckpoint);
        do {
            System.out.println("nhập điểm môn C++:");
            cPlus = sc.nextDouble();
            xcheckpoint = checkpoint(cPlus);
        }while(!xcheckpoint);
        do {
            System.out.println("nhập điểm môn java:");
            javaPoint = sc.nextDouble();
            xcheckpoint = checkpoint(javaPoint);
        }while(!xcheckpoint);
        
    }
    
    public void xepLoai (){
        if(dtb()<5){
            System.out.println("loại trung bình");
        }else if(dtb()>=5&&dtb()<=8){
            System.out.println("loại khá");
        }else {
            System.out.println("loại giỏi");
        }
    }
    public static void main(String[] args) {
        SinhVien x = new SinhVien();
        x.insertInformation();
        x.xepLoai();
        x.dtb();
    }
}
    
   