
import java.util.*;

public class TaskManager {
    
        private HashSet<Task> TaskSet = new HashSet<>();
        public void addTask(Task task){
            if(TaskSet.add(task)){
                System.out.println("Đã thêm thành công");
            }
            else{
                System.out.println("Đã có mã ID này");
            }
        }   
        public void removeTask(String id){
            boolean timthay = false;
            for(Task t : TaskSet){
                if(t.getId().equalsIgnoreCase(id)){
                    TaskSet.remove(t);
                    System.out.println("Đã xóa");
                    timthay = true;
                    break;
                }  
            }
            if(!timthay){
                System.out.println("Không tìm thấy");
            }
        }
        public void hienThiTask(){
            if(TaskSet.isEmpty()){
                System.out.println("Danh sách rỗng");
            }
            for (Task t : TaskSet){
                System.out.println(t);
            }
        }
        public void timkiemTask(String key){
            boolean timThay = false;
            for(Task t : TaskSet){
                if(t.getDeadline().equalsIgnoreCase(key) || t.getDescription().contains(key)){
                    System.out.println(t);
                    timThay = true;
                }
            }
            if(!timThay){
                System.out.println("Khong tìm thấy");
            }
        }






}

