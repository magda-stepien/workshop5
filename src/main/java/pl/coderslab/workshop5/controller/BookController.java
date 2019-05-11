package pl.coderslab.workshop5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.workshop5.model.Book;
import pl.coderslab.workshop5.service.MemoryBookService;

import java.util.List;

// controller restowy zawsze zwraca ciąg znaków który jest jsonem

@RestController
@RequestMapping("/books")

public class BookController {
    private MemoryBookService mbs;

    @Autowired
    public BookController(MemoryBookService mbs) {
        this.mbs = mbs;
    }

    @GetMapping("/hello")
    public String hello() {
        return "{hello: World}";
    }

    @GetMapping("helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming");
    }

// jeśli mam akcję public String helloBook() ale chcę zwrócić instancję książki  return new Book
// - błąd bo akcja jest Stringiem
// ale chcemy zwrócić Jsona więc potrzebuję ciąg znaków
// Zmieniam metodę ze String na Book -> error 500 'no converter found for return type Book'
    // converter nie wie jak przerobić Booka na Stringa -> musimy napisać Converter
    // ale jest biblioteka która zrobi to za nas :) zad4 !!!! JACKSON - potężna biblioteka :D


   //Pobieranie listy danych - listy książek
    @GetMapping("") //na adres w kontrolerze
    public List<Book> getAllBooks(){
        return this.mbs.getList();
    }

    //pobranie książki o danym id
    @GetMapping("/{id}")
    public Book getBook(@PathVariable long id){
        return this.mbs.getBookById(id);
    }
}

