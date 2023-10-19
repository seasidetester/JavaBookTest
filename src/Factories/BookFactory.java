package Factories;

import Class.*;

public class BookFactory {

    public Book getBookType(String BookType)
    {
        return switch (BookType) {
            case "Magazine" -> new Magazine();
            case "Encyclopedia" -> new Encyclopedia();
            default -> new Book();
        };
    }

}
