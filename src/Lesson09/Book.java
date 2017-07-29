package Lesson09;

/**
 * Created by Vitaliy Tsvetkov on 23.07.2017.
 */
public class Book {
    private String id;
    private String title;
    private Author author; // указываем что поле author является типом Author
    private String year;
    private String description;
    private String isbn; //international serial book number

    //конструктор, принимающий автора в виде автора
    public Book(String id, String title, Author author, String year, String description, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.isbn = isbn;
    }

    //конструктор, принимающий автора в виде строки и уже вызывающего первый конструктор для передачи автора в нужном виде
    public Book(String id, String title, String author, String year, String description, String isbn) {
        //создаем вызов конструктора
        this(id,
                title,
                new Author(author.split(" ")[0], author.split(" ")[1]),
                year,
                description,
                isbn);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", year='" + year + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}