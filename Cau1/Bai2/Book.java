public class Book{
    private int id;
    private String title;
    private String author;
    private String genre;

    public int getId(int id){
        return this.id = id;
    }
    public String getTitle (){
        return title;
    }
    public String getAuthor (){
        return author;
    }
    public String getGenre (){
        return genre;
    }

    public Book(int id,String title,String author,String genre){
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    @Override
    public String toString(){
        return "ID: "+id+" | Title: "+title+" | Author: "+author+" | Genre: "+genre;
    }
}