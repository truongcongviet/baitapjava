package HomeWork;

import java.util.Scanner;
import java.util.ArrayList;

public class ChangeArray {

    public static void main(String[] args) {
        int n, number, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập Các Phần tử của mảng: ");
        ArrayList<Integer> arr = new ArrayList();

        for ( i=0; i < n; i++) {
            System.out.print("a[" + i + "] =");
            a[i] = sc.nextInt();
            arr.add(a[i]);
            
        }
        do{
        number = arr.indexOf(3);
        System.out.println("Vị trí có số 3 là vị trí số " + number +"\t");
        }while(i==n);
        int replaceNumber = arr.get(number) * arr.get(number);
        arr.set(number, replaceNumber);
        System.out.print("Mảng sau khi thay thế: ");
        for (int j = 0; j <= arr.size()-1; j++) {
            System.out.print( arr.get(j)+ "\t");
        }

    }

}
