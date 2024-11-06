package com.example.demo;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
	public void save(BookEntity b) {
		bookRepo.save(b);
	}
	
	public List<BookEntity> getAllBook(){
		return bookRepo.findAll();
	}

	public BookEntity getBookById(int id) {
		return bookRepo.findById(id).get();
	}

	public void deleteById(int id) {
		
		bookRepo.deleteById(id);
		
		
	}
	
	

}
