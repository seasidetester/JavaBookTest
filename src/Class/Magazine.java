package Class;

public class Magazine extends Book {

//    public Magazine (String Title, String Author, int Pages)
//    {
//        this.bookAuthor = Author;
//        this.bookTitle = Title;
//        this.pageCount = Pages;
//    }
    @Override
    public int showPages()
    {
        return this.pageCount;
    }
}
