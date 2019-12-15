package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Books {

	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	
	private String author;
	
	private String pages;
	
	

	private Books() {
		super();
	}

	public Books(Long id, String title, String author, String pages) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}
	
	
	
	
}
