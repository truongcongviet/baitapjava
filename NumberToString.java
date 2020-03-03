
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

import java.util.Scanner;

/**
 * Convert integer to string in Vietnamese
 * @author Vu Chung
 */
public class NumberToString {
    
    private int num;
    private String result;
    
    public NumberToString(int num){
        this.num = num;
    }
    private String convert(int value){
        String res="";
        switch(value){
            case 1: res="Một"; break;
            case 2: res="Hai";break;
            case 3: res="Ba";break;
            case 4: res="Bốn";break;
            case 5: res="Năm";break;
            case 6: res="Sáu";break;
            case 7: res="Bảy";break;
            case 8: res="Tám";break;
            case 9: res="Chín";break;
            case 0: res="Không";break;
        }
        return res;
    }
    private int exchange(){
        if(num!=0){
            int firstnum = num%1000;
            num = num/1000;
            return firstnum;
        }
        else return 0;
    }
    private String target(){
        int firstnumber = this.exchange();
        
        if(firstnumber==0) return "";
        
        String res;
        int donvi=firstnumber%10;
        int hangchuc = (firstnumber/10)%10;
        int hangtram = firstnumber/100;
        
        String ht="";
        String hc ="";
        String dv ="";
        
        if(num>0) {
            ht =this.convert(hangtram)+" Trăm ";
            if(hangchuc==0) {
                hc = "Lẻ ";
            }
            else hc =this.convert(hangchuc) +" Mươi ";
            
        }
        else {
            if(hangtram==0) {
                ht = "";
                if(hangchuc==0 && donvi!=0) {
                        hc = "";
                }
                else {
                    hc =this.convert(hangchuc) +" Mươi ";
                }
            }
            else {
                ht =this.convert(hangtram)+" Trăm ";
                
                if(hangchuc==0 && donvi!=0) {
                        hc = " Lẻ ";
                }
                else if(hangchuc!=0) {
                    hc =this.convert(hangchuc) +" Mươi ";
                }
            }
            
        }
        
         
            if(hangchuc>0) {
                switch (donvi) {
                    case 0:
                        dv =""; break;
                    case 5:
                        dv = "Lăm"; break;
                    default:
                        dv =this.convert(donvi);
                        break;
                }
            }
            else {
                dv =this.convert(donvi);
            }
            
        if(hangchuc==0 && donvi==0){
            dv="";
            hc="";
        }
        else if(hangchuc==1){
            hc="Mười ";
        }
        else if(hangchuc>1 && donvi==1) {
            dv = "Mốt";
        }
        if(hangtram>0 && hangchuc==0 && donvi!=0) {
            hc = "Lẻ ";
        }
        
        res= ht+hc+dv;
        return res;
    }
    
    public String run(){
        if(num<1000)
            return target();
        else if(num<1000000){
            String x1 = this.target();
            String x2 = this.target();
            return x2 + " Nghìn "+x1;
        }
        else if(num<1000000000){
            String x1 = this.target();
            String x2 = this.target();
            String x3 = this.target();
            String x22 = "" ;
            if(!x2.equals("")) x22 = x2 + " Nghìn ";
            return x3 + " Triệu " + x22+x1;
        }
        else {
            String x1 = this.target();
            String x2 = this.target();
            String x22 = "" ;
            if(!x2.equals("")) x22 = x2 + " Nghìn ";
            String x3 = this.target();
            String x33 = "" ;
            if(!x3.equals("")) x33 = x3 + " Triệu ";
            String x4 = this.target();
            return x4 + " Tỷ " +x33 + x22 +x1;
        }
    }
    @Override
    public String toString() {
        return run();
    }
    
    public static void main(String[] args) {
        int n=1;
        while (n>0) {
            System.out.println("Mời nhập số từ 0 đến 2 tỷ: ");
            n =Integer.parseInt(new Scanner(System.in).nextLine());
            NumberToString num = new NumberToString(n);
            System.out.println("Tiếng Việt: " +num);
        }
        
        
    }
    
}
