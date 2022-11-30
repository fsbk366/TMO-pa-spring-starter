package com.galvanize.tmo.paspringstarter;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class Book {
	
	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("author")
	private String author;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("yearPublished")
	private Integer yearPublished;
}
