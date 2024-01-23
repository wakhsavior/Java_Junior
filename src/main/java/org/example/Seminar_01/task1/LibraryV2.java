package org.example.Seminar_01.task1;

import java.util.List;

public class LibraryV2 {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Преступление и наказание", "Фёдор Достоевский", 1866),
                new Book("Евгений Онегин", "Александр Пушкин", 1833),
                new Book("Война и мир", "Лев Толстой", 1869),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 1967),
                new Book("Анна Каренина", "Лев Толстой", 1877)
        );
        List<Book> authorBooks =books.stream()
                .filter(book -> "Лев Толстой".equals(book.getAuthor()))
                .toList();
        System.out.println("Книги Льва Толстого:\n" + authorBooks);

        List<Book> booksAfter1866 = books.stream()
                .filter(book -> book.getYear() > 1866)
                .toList();
        System.out.println("Книги опубликованные после 1866 года:\n" + booksAfter1866);
        List<String> uniqueTitles = books.stream()
                .map(Book::getTitle)
                .distinct()
                .toList();
        System.out.println("Уникальные наименования книг:\n" + uniqueTitles);
    }

}
