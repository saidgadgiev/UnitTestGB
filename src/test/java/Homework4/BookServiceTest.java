package Homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    void testFindBookById() {
        // Создаем книгу для ожидаемого результата
        Book expectedBook = new Book("12345", "Book 1");

        // Устанавливаем поведение мок-объекта bookRepository
        when(bookRepository.findById("12345")).thenReturn(expectedBook);

        // Вызываем метод findBookById() у bookService
        Book actualBook = bookService.findBookById("12345");

        // Проверяем, что возвращаемая книга совпадает с ожидаемой
        Assertions.assertEquals(expectedBook, actualBook);
    }

    @Test
    void testFindAllBooks() {
        // Создаем список книг для ожидаемого результата
        List<Book> expectedBooks = Arrays.asList(
                new Book("12345", "Book 1"),
                new Book("67890", "Book 2")
        );

        // Устанавливаем поведение мок-объекта bookRepository
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        // Вызываем метод findAllBooks() у bookService
        List<Book> actualBooks = bookService.findAllBooks();

        // Проверяем, что возвращаемый список книг совпадает с ожидаемым
        Assertions.assertEquals(expectedBooks, actualBooks);
    }
}
