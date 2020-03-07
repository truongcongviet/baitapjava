
package HomeWork;

import java.util.Scanner;


public class Fibonaci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Số cần nhập: ");
        n = sc.nextInt();
        System.out.print("Các số fibonaci cần tìm là: ");
        for(int a= 0; a<100; a++){
            if(fibonacci(a)<n){
                System.out.println(fibonacci(a)+" ");
            } else {
                break;
            }
        }
        
    }
    public static int fibonacci(int i){
            if (i < 0) {
            return -1;
        } else if (i == 0 || i == 1) {
            return i;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
          
}
