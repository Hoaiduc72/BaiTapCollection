
public class Product{
    private String ten;
    private long gia;
    private int soLuong;

    public String getTen() {
        return ten;
    }
    public long getGia() {
        return gia;
    }
    public int getSoLuong() {
        return soLuong;
    }

    public Product(String ten,long gia,int soLuong){
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;

    }
    @Override
    public String toString(){
        return "Tên: "+ten+" | Giá: "+gia+" | Số lượng: "+soLuong;
    }

  
}