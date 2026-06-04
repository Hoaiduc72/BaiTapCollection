import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TaskManager taskManager = new TaskManager();
    while(true){
            System.out.println("Chọn chức năng");
            System.out.println("1. Thêm task");
            System.out.println("2. Xóa task");
            System.out.println("3. Tìm task");
            System.out.println("4. Hiển thị all task");
            System.out.println("0. Thoát");
            int chon = sc.nextInt();
            sc.nextLine();
        switch(chon){
            case 1:
                System.out.print("Nhập sl task cần thêm: ");
                int n = sc.nextInt();sc.nextLine();
                for(int i = 0; i<n;i++){
                System.out.print("Nhập ID: "); String id = sc.nextLine();
                System.out.print("Nhập des: "); String des = sc.nextLine();
                System.out.print("Nhập deadline: "); String dl = sc.nextLine();
                System.out.print("Nhập priority: "); int pri = sc.nextInt();
                sc.nextLine();
                taskManager.addTask(new Task(id,des,dl,pri));
                }
                break;
            case 2:
                System.out.print("Nhập ID Task cần xóa: ");
                String idXoa = sc.nextLine();
                taskManager.removeTask(idXoa);
                break;
            case 3:
                System.out.println("Nhập task cần tìm: ");
                String key = sc.nextLine();
                taskManager.timkiemTask(key);
                break;
            case 4:
                System.out.println("Hiển thị all Task");
                taskManager.hienThiTask();
                break;
            
            case 0:
                System.out.println("Goodbye nigga");
                System.exit(0);
            default:
                System.out.println("Lựa chọn k phù hợp");
        }

    }

    }
}
