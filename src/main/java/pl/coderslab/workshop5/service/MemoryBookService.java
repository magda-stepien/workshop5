package pl.coderslab.workshop5.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.coderslab.workshop5.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service   // będzie to komponent który jest serwisem, bardzoej szczegółowy komponent

public class MemoryBookService {

    private List<Book> list;

    public MemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        list.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
        list.add(new Book(3L, "9780130819380", "Ania z Zielonego Wzgórza",
                "Montgomery", "Znak", "przygodowa"));
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }
    // lista książek zaciągnie się do frontu - index.html - zrobiony na warsztatach 4

    public Book getBookById(long id) {
        for (Book b : this.list) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
}

