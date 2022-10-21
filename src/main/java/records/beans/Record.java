package records.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Oct 17, 2022
 */

@Entity
public class Record {
	
	//Properties
	@Id
	@GeneratedValue
	private long id;
	private String artist;
	private String title;
	int year;
	double price;
	
	//Default No Arg Constructor
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//Constructor using all fields
	public Record(long id, String artist, String title, int year, double price) {
		super();
		this.id = id;
		this.artist = artist;
		this.title = title;
		this.year = year;
		this.price = price;
	}

	//Constructor without id
	public Record(String artist, String title, int year, double price) {
		super();
		this.artist = artist;
		this.title = title;
		this.year = year;
		this.price = price;
	}
	
	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//To String method
	@Override
	public String toString() {
		return "Record [id=" + id + ", artist=" + artist + ", title=" + title + ", year=" + year + ", price=" + price
				+ "]";
	}

}
