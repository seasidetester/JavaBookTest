package Class;

public class Encyclopedia extends Book {
//    public Encyclopedia (String Title, String Author, int Pages)
//    {
//        this.bookAuthor = Author;
//        this.bookTitle = Title;
//        this.pageCount = Pages;
//    }

    @Override
    public int showPages(){
        return this.pageCount;
    }
}
