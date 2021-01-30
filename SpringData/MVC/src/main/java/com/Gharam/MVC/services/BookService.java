package com.Gharam.MVC.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.Gharam.MVC.models.Book;
import com.Gharam.MVC.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookrepo ;
	
	public BookService(BookRepository bookrepo) {
		this.bookrepo=bookrepo;
	}
	
	public List<Book> allBooks(){
		return bookrepo.findAll();
	}
	
	public Book create(Book newBook){
		return bookrepo.save(newBook);
	}
	
	public Book FindBook(Long id) {
		Optional<Book> optionalBook = bookrepo.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		}else {
			return null;
			}
		}
	
	public void deleteBook(Long id) {
		if (bookrepo.findById(id).isPresent()) {
			bookrepo.deleteById(id);
		    }
	}
	
	public Book updateBook(Long id ,String title ,  String desc ,String lang ,Integer numOfPages) {
		Book book = bookrepo.findById(id).get();
		book.setTitle(title);
		book.setDescription(desc);
		book.setLanguage(lang);
		book.setNumberOfPages(numOfPages);
		return bookrepo.save(book);
	}
}

