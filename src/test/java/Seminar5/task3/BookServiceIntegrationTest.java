package Seminar5.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookServiceIntegrationTest {
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookService = new BookService();
    }

    @Test
    public void testAddBookAndGetAllBooks() {
        // Создание трёх книг
        Book book1 = new Book("Война и мир", "Лев Толстой");
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский");
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков");

        // Добавление книг в сервис
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        // Получение списка всех книг
        List<Book> books = bookService.getAllBooks();

        // Проверка, что список не является null
        assertNotNull(books);

        // Проверка, что список содержит 3 книги
        assertEquals(3, books.size());

        // Вывод информации о каждой книге
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
