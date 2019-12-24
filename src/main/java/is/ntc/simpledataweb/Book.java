package is.ntc.simpledataweb;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Book {
	private @Id @GeneratedValue Long id;
	  private String name;
	  private String author;
	  private String publisher;
	  private short year;
	  
	  Book () {};
	  
	  public Book(String name, String author, String publisher, short year) {
		    this.name = name;
		    this.author = author;
		    this.publisher = publisher;
		    this.year = year;
	  }

}
