
package QuanLySinhVien;

public class SinhVien {
    
    String maSV, hoten;
    boolean gioiTinh ;
    float toan,ly,hoa;
    int tongDiem = (int )(toan + ly + hoa);
     public void displaySinhVien(){
         System.out.println("Mã SV: "+ maSV);
         System.out.println("TenSV: "+ hoten);
         System.out.println("giới tính : "+ gioiTinh);
         System.out.println("điểm Toán: "+ toan);
         System.out.println("điểm Lý: "+ ly);
         System.out.println("điểm Hóa: "+ hoa);
         System.out.println(tongDiem);
                
     }
    
}
