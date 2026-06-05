import java.util.*;

public class Library {
    private ArrayList<Book> List = new ArrayList<>();

    public void addBook(Book newBook) throws Exception{
        for(Book b : List){
            if(b.getTieuDe().equalsIgnoreCase(newBook.getTieuDe())){
                throw new Exception("Đã có sách này trong thư viện, k thể thêm");
            }
        }
        List.add(newBook);
        System.out.println("Đã thêm vào thư viện");
    }
    public void removeBook(String ten) throws BookNotFoundException{
        boolean timThay = false;
        for(Book b : List){
            if(b.getTieuDe().equalsIgnoreCase(ten)){
                System.out.println("Đã xóa");
                List.remove(b);
                timThay = true;
            }
        }
        if(!timThay){
            throw new BookNotFoundException("K tìm thấy");
        }
    }
    public void displayBooks(){
        for(Book b : List){
            System.out.println(b);
        }
    }
    public void searchBookByTitle(String title) throws BookNotFoundException{
        boolean timThay = false;
        for(Book b : List){
            if(b.getTieuDe().equalsIgnoreCase(name)){
                System.out.println(b);
                timThay = true;
                break;
            }
        }
        if(!timThay){
            throw new BookNotFoundException("K tìm thấy");
        }
    }
    public void searchBookByAuthor(String author) throws BookNotFoundException{
        boolean timThay = false;
        for(Book b : List){
            if(b.getTacGia().equalsIgnoreCase(author)){
                System.out.println(b);
                timThay = true;
            }
        }
        if(!timThay){
            throw new BookNotFoundException("K tìm thấy");
        }
    }




}
