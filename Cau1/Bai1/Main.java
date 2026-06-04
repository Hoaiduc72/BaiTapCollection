import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> sv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Chọn nội dung thực hiện");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Tìm sinh viên");
            System.out.println("4. Hiển thị tất cả sv");
            System.out.println("5. Thoát");
            System.out.println("--------------------------");
            int chon = sc.nextInt();
            sc.nextLine();


            switch(chon){
                case 1:
                    System.out.print("Nhập số sinh viên cần thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for(int i = 0; i<n;i++){
                        System.out.println("Nhập thông tin sv "+(i+1));
                        System.out.print("Nhập ID: ");
                        String id = sc.nextLine();
                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập tuổi: ");
                        int age = sc.nextInt();
                        System.out.print("Nhập điểm: ");
                        float grade = sc.nextFloat();

                        Student ttsv = new Student(id, name, age, grade);
                        sv.add(ttsv);
                    }
                    break;
                case 2:
                    System.out.print("Nhập tên sinh viên cần xóa: ");
                    String ten = sc.nextLine();
                    int viTriXoa=sv.indexOf(ten);
                    if(viTriXoa != -1){
                        sv.remove(viTriXoa);
                        System.out.println("Đã xóa");
                    }
                    else{
                        System.out.println("Không tìm thấy");
                    }
                    break;
                case 3:
                    System.out.print("Nhập sinh viên cần tìm: ");
                    String t = sc.nextLine();
                    int i = sv.indexOf(t);
                    if(i!=-1){
                        System.out.println( sv.indexOf(i)); 
                    }
                    else{
                        System.out.println("Không tìm thấy");
                    }
                    break;
                case 4:
                    System.out.println("Hiển thị thông tin sinh viên");
                    for(Student st : sv){
                        System.out.println(st);
                    }
                    break;
                case 5:
                    System.out.println("Goodbye");
                    System.exit(0);
            }
        }

    }
}
