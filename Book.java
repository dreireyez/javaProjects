//Constructors Exercise

//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
import java.util.*;
public class Book 
{
    private String title, author;
    private int isbn;

    public Scanner input = new Scanner(System.in);

    Book(String title, String author, int isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void addBook()
    {
        System.out.println("Enter Title: ");
            title = input.nextLine();
        System.out.println("Enter Author: ");
            author = input.nextLine();
        System.out.println("Enter ISBN: ");
            isbn = input.nextInt();
    }

    void removeBook()
    {
        collection.remove();
    }

    public static void main(String[] args) 
    {
        Book book1 = new Book();

        ArrayList<Book> collection =  new ArrayList<Book>();


    }
}
