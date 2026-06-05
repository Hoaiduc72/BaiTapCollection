import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Inventory in = new Inventory();
        while(true){
            System.out.println("Chọn chức năng");
            System.out.println("1. Thêm sp");
            System.out.println("2. Xóa sp");
            System.out.println("3. Hiển thị sp");
            System.out.println("4. Tìm sp");
            System.out.println("0. Thoát");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 :
                    System.out.print("Nhập số sp cần thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                    System.out.print("Nhập tên sp "+(i+1)+": ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập giá sp "+(i+1)+": ");
                    long gia = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Nhập số lượng sp "+(i+1)+": ");
                    int soluong = sc.nextInt();
                    sc.nextLine();
                    try{
                        in.addProduct(new Product(ten,gia,soluong));
                     }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                     }
                    }
                    break;
                case 2:
                    System.out.print("Nhập tên sp cần xóa: ");
                    try {
                    String xoa = sc.nextLine();
                    in.removeProduct(xoa);
                    }
                    catch(Exception e) {
                        System.out.println("Nhập sai dữ liệu, vui lòng nhập lại");
                    }
                    break;
                case 3:
                    System.out.println("Thông tin tất cả sp");
                    in.displayProducts();
                    break;
                case 4:
                    System.out.print("Nhập tên sp cần tìm: ");
                    String tim = sc.nextLine();
                    try{
                        in.findProduct(tim);
                    }
                    catch(Exception e){
                        System.out.println("Nhập sai dữ liệu, vui lòng nhập lại");
                    }
                    break;
                case 0:
                    System.out.println("Go fk yourself");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn lỗi");
            }
        }
    }
}
