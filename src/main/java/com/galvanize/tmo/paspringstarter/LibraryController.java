package com.galvanize.tmo.paspringstarter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired BookService bookService;
    
    @GetMapping("/health")
    public void health() {

    }
    
    @PostMapping("/api/books")
    public ResponseEntity<Book> save(@RequestBody Book book)  {
        return new ResponseEntity<>(bookService.save(book), HttpStatus.CREATED);
    }
    
    @GetMapping("/api/books")
    public ResponseEntity<List<Book>> getAll() {
        return new ResponseEntity<>(bookService.getAll(), HttpStatus.OK);
    }
    
    @DeleteMapping("/api/books")
    public ResponseEntity<String> deleteAll() {
        bookService.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
