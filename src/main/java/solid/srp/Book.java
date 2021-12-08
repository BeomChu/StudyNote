package solid.srp;

public class Book {
    String title;
    int price;
    String category;
    String author;
    int authorAge;
    String authorAddress;

    public Book(String title,int price,String category,String author,int authorAge,String authorAddress){
        this.title=title;
        this.price=price;
        this.category=category;
        this.author=author;
        this.authorAge=authorAge;
        this.authorAddress=authorAddress;
    }
}
