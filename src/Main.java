
import java.util.HashMap;

import AbstractClasses.AbstractBook;
import Class.Book;
import Factories.BookFactory;


import static java.lang.System.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
         Press Alt+Enter with your caret at the highlighted text to see how
         IntelliJ IDEA suggests fixing it.
        */

        BookFactory bf = new BookFactory();
        Book myMagazine = bf.getBookType("Magazine");
        myMagazine.setBookInfo("Test", "AssBalls", 1000);

        Book myEncyclopedia = bf.getBookType("Encyclopedia");
        myEncyclopedia.setBookInfo("Test123", "AssBalls3", 5230);

        HashMap<Integer, Book> Library = new HashMap<>();

        Library.put(1, myMagazine);
        Library.put(2, myEncyclopedia);
        out.println(Library.values());
        out.println(Library.get(1).showPages());
        Library.forEach((Key, Value) -> out.println(Key + "\n"+ Value.showBookInformation()));

    }
}