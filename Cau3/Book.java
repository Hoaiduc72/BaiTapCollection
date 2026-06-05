public class Book{
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;

    public Book(String tieuDe,String tacGia,int namXuatBan){
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
    }

    public String getTieuDe(){ return tieuDe;}
    public String getTacGia(){ return tacGia;}
    public int getNamXuatBan(){ return namXuatBan;}

    public String toString(){
        return " Tieu De: "+tieuDe+"  |  Tac Gia: "+tacGia+"  |  Nam XB: "+namXuatBan;
    }
}