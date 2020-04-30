package Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Product {

    String nameProduct;
    String NhaSX;
    float price;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNhaSX() {
        return NhaSX;
    }

    public void setNhaSX(String NhaSX) {
        this.NhaSX = NhaSX;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<Product> sanPham = new ArrayList<Product>();

    public Product(String nameProduct, String NhaSX, float price) {
        this.nameProduct = nameProduct;
        this.NhaSX = NhaSX;
        this.price = price;
    }

    public Product() {
    }

    //Hàm nhập số liệu
    public void input(Product pd) {

        System.out.println("Nhập Tên sản phẩm: ");
        nameProduct = sc.nextLine();
        if (nameProduct.equals("")) {
            nameProduct = sc.nextLine();
        }
        System.out.println("Nhà sản xuất: ");
        NhaSX = sc.nextLine();
        System.out.println("Nhập Giá sản phẩm: ");
        price = sc.nextFloat();
        sanPham.add(pd);

    }

    public void display() {
        System.out.println("Tên SP: " + this.nameProduct);
        System.out.println("Nhà SX: " + this.NhaSX);
        System.out.println("GIá SP: " + this.price);
        System.out.println("------------------------------");
    }

    // Hiển thị số liệu
    public void output() {
        for (int i=0; i<sanPham.size();i++) {
            sanPham.get(i).display();
        }
    }

    public void SapXep(Product pd) {
        System.out.println("========================================");
        System.out.println("Sắp Xếp sản phẩm từ thấp đến cao dựa vào đơn giá: ");
        ArrayList<Product> product = null;
        Collections.sort(sanPham, new Comparator<Product>() {
            @Override
            public int compare(Product pd1, Product pd2) {

                if (pd1.getPrice() < pd2.getPrice()) {
                    return 1;
                } else {
                    if (pd1.getPrice() > pd2.getPrice()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }

            }
        });
    }
}
