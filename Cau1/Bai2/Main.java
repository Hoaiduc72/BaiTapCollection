import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Book> lib = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("CHỌN CHỨC NĂNG");
            System.out.println("1. Thêm sách");
            System.out.println("2. Xóa sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Hiển thị all và tìm bằng title or author");
            int chon = sc.nextInt();
            sc.nextLine();
            
            switch(chon){
                case 1: 
                    System.out.print("Nhập số lượng sách cần thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for(int i = 0;i < n;i++){
                        System.out.println("Nhập thông tin sách số "+(i+1));
                        System.out.print("Nhập ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhập title: ");
                        String title = sc.nextLine();
                        System.out.print("Nhập author: ");
                        String author = sc.nextLine();
                        System.out.print("Nhập genre: ");
                        String genre = sc.nextLine();
                        
                        Book b = new Book(id, title, author, genre);
                        lib.put(id, b);
                    }
                    break;
                case 2:
                    System.out.print("Nhập ID sách cần xóa: ");
                    int idXoa = sc.nextInt();
                    if(lib.containsKey(idXoa)!=false){
                        lib.remove(idXoa);
                        System.out.println("Đã xóa sách trên");
                    }
                    else{
                        System.out.println("không tìm thấy sách");
                    }
                    break;
                case 3:
                    System.out.println("Nhập ID sách cần tìm: ");
                    int idTim = sc.nextInt();
                    sc.nextLine();
                    Book b = lib.get(idTim);
                    if(b!=null){
                        System.out.println(b);
                    }
                    else{
                        System.out.println("Không tìm thấy sách");
                    }
                    break;
                case 4:
                    System.out.println("Thư viện sách gồm: ");
                    for(int key : lib.keySet()){
                        Book b1 = lib.get(key);
                        System.out.println(b1);
                    }
                    System.out.println("Nhập title or author cần tìm: ");
                    String x = sc.nextLine();
                    boolean timThay = false;
                    for(int key : lib.keySet()){
                        Book b2 = lib.get(key);
                        if(b2.getTitle().equalsIgnoreCase(x) || b2.getAuthor().equalsIgnoreCase(x)){
                            System.out.println(b2);
                            timThay = true;
                        }
                    }
                    if(!timThay){
                        System.out.println("Không tìm thấy sách");
                    }
                    break;
                default:
                    System.exit(0);
                
                
                
                }
        }

    }
}
