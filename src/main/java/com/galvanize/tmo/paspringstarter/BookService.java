package com.galvanize.tmo.paspringstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> getAll() {
		return bookRepository.findAll();
	}
	
	public void deleteAll() {
		bookRepository.deleteAll();
	}
}
