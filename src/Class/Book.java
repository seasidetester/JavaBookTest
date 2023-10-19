package Class;

import AbstractClasses.AbstractBook;

public class Book extends AbstractBook {

    public void setBookInfo (String Title, String Author, int Pages)
    {
        this.bookAuthor = Author;
        this.bookTitle = Title;
        this.pageCount = Pages;
    };

    public int showPages()
    {
        return this.pageCount;
    };
    public String showBookInformation()
    {
        return String.
                format("Book Title => %s %n" +
                        "Book Author => %s %n" +
                        "Book Pages => %d", this.bookTitle, this.bookAuthor, this.pageCount);
    };
}
