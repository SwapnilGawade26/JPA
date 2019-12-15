package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Books")
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@GetMapping("/")
	public List<Books> getData() {

		return bookRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Books> getData(@PathVariable Long id) {

		return bookRepository.findById(id);
	}

	
	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = { "application/json" })
	public Books saveGetData(@RequestBody Books book) {

		return bookRepository.save(book);
	}

	@GetMapping("/create")
	public List<Books> getBook()

	{
		Books book1 = new Books(1L, "sdfjh", "sdfjh", "23");
		bookRepository.save(book1);
		System.out.println("sdfjsdf");
		return bookRepository.findAll();
	}

	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PATCH, consumes = { "application/json" })
	public Books updateExistBook_patch(@PathVariable("id") Long id,@RequestBody Books book) {
		
		
		bookRepository.save(book);
	
		return book;

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
	public String deleteExistBook_patch(@PathVariable("id") Long id) {
		
		
		bookRepository.deleteById(id);
	
		return "Deleted";

	}
	
	/*
	 * @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {
	 * "application/json" }) public Books updateExistBook_put(@PathVariable("${id}")
	 * Long id,@RequestBody Books book) {
	 * 
	 * 
	 * bookRepository.save(book);
	 * 
	 * return book;
	 * 
	 * }
	 */

}