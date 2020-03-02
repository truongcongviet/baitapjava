/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import java.util.Scanner;
public class testSoLe{
    public static void main(String[] args) {
       int n, max =10, mul = 1;
       Scanner sc = new Scanner(System.in);
       int A[] = new int[max];
       do {
           System.out.println("Nhập số phần tử của mảng: ");
           n = sc.nextInt();
           
       }while (n<=2||n>max-1);
        System.out.println("Nhập số nguyên: ");
        for(int i=0;i<n;i++){
            System.out.println("A[" + i+"] = ");
            A[i] = sc.nextInt();
            if (A[i]%2!=0){
                mul*=A[i];
            }
            
        }
        System.out.println("Kết quả nhân số lẻ = "+mul);
    }
    
   
}
