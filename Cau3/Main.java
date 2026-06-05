import java.util.*;
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Chọn chương trình");
            System.out.println("1. Thêm book");
            System.out.println("2. Xóa book");
            System.out.println("3. Hiển thị all book");
            System.out.println("4. Tìm kiếm book bằng title");
            System.out.println("5. Tìm kiếm book bằng author");
            System.out.println("0. Thoát");
            int chon = sc.nextInt();
            sc.nextLine();

            switch(chon){
                case 1:
                    System.out.print("Nhập sl book cần thêm: ");
                    int n = sc.nextInt(); sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập title: ");
                        String title = sc.nextLine();
                        System.out.print("Nhập author: ");
                        String author = sc.nextLine();
                        System.out.print("Nhập năm xb: ");
                        int year = sc.nextInt();
                        sc.nextLine();

                        try{
                        lib.addBook(new Book(title,author,year));
                        }
                        catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nhập book cần xóa: ");
                    String xoa = sc.nextLine();
                    try{
                    lib.removeBook(xoa);
                    }
                    catch(BookNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3: 
                    System.out.println("Danh sách book: ");
                    lib.displayBooks();
                    break;
                case 4:
                    System.out.print("Nhập title book cần tìm: ");
                    String timT = sc.nextLine();
                    try{
                        lib.searchBookByTitle(timT);
                    }
                    catch(BookNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                case 5:
                    System.out.println("Nhập author book cần tìm: ");
                    String timA = sc.nextLine();
                    try{
                        lib.searchBookByAuthor(timA);
                    }
                    catch(BookNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                case 0:
                    System.out.println("Get fucking out");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn lỗi");
            }
        }


    }
}
