import java.util.*;
public class Inventory {
    ArrayList<Product> ListPr = new ArrayList<>();
    public void addProduct(Product p) throws Exception{
        if(p.getSoLuong()<0){
            throw new Exception("Số lượng k được < 0");
        }
        ListPr.add(p);
        System.out.println("Đã thêm sản phẩm"); 
    }
    public void removeProduct(String xoa) throws Exception{
        boolean timThay = false;
        for(int i = 0;i < ListPr.size();i++){
            if(ListPr.get(i).getTen().equalsIgnoreCase(xoa)){
                ListPr.remove(i);
                System.out.println("Đã xóa sản phẩm");
                timThay = true;
            }
        }
        if(!timThay){
            throw new Exception("Không tìm thấy sản phẩm");
        }
    }
    public void displayProducts(){
        for(Product p : ListPr){
            System.out.println(p);
        }
    }
    public void findProduct(String tim) throws Exception{
        boolean timThay =false;
        for (int i = 0; i < ListPr.size(); i++) {
            if(ListPr.get(i).getTen().equalsIgnoreCase(tim)){
                System.out.println("Đã tìm thấy sản phẩm");
                System.out.println(ListPr.get(i));
                timThay=true;
            }
        }
        if(!timThay){
            throw new Exception("Không tìm thấy sản phẩm");
        }
    }
}


