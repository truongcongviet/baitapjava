package hoctring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NegativeNumber {

    public static boolean isNumeric(String ch) {
        try {
            Double.parseDouble(ch);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi từ bàn phím: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
       
        for (int i = 0; i < ch.length; i++) {
           if (ch[i] == '-' && isNumeric(String.valueOf(ch[i+1]))){
               System.out.println("-"+ch[i+1]);
           }
        }

    }
}
