package org.example.summary_10_05_24;

import java.io.*;
import java.util.Arrays;

public class Book implements Serializable{
    private String title;
    private String author;
    private double price;
    private int bookCount;

    public Book(String title, String author, double price, int bookCount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookCount = bookCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", bookCount=" + bookCount +
                '}';
    }

    public static void main(String[] args) throws IOException {
        Book book1 = new Book("Harry Potter1", "Joanne K. Rowling", 12.5, 1);
        Book book2 = new Book("Harry Potter2", "Joanne K. Rowling", 17.5, 2);
        Book book3 = new Book("Harry Potter3", "Joanne K. Rowling", 10.8, 3);
        Book book4 = new Book("Harry Potter4", "Joanne K. Rowling", 19.3, 4);
        Book book5 = new Book("Harry Potter5", "Joanne K. Rowling", 21.5, 5);
        Book[] books = {book1,book2,book3,book4,book5};

        try (FileOutputStream fos = new FileOutputStream("books.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(books);
            for (Book book : books){
                oos.writeObject(book);
            }

        } catch (IOException ignore) {

        }
        try (FileInputStream fis = new FileInputStream("books.txt");
        ObjectInputStream ois = new ObjectInputStream(fis)){
           Book[] books1 = (Book[]) ois.readObject();
            System.out.println(Arrays.toString(books1));
        }catch (IOException e){
            System.out.println("Problem with File: "+e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
  //  Сохранить их в файл. Считать из файла.
