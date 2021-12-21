package com.stackroute.newz.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/* 
 * Annotate the class with @Component annotation. 
 * @Component annotation is used to crete singleton instance of of the class
 *
 */

/*
 * The class "News" will be acting as the data model for the News data in the ArrayList.
 */
public class News implements Serializable {

	private static final long serialVersionUID = -1280037900360314186L;

	private int newsId;
	private String title;
	private String author;
	private String description;
	private LocalDateTime publishedAt;
	private String content;

	/*
	 * This class should have five fields (newsId, title, author, description,
	 * content and publishedAt). This class should also contain the getters and
	 * setters for the fields. The value of publishedAt should not be accepted from
	 * the user but should be always initialized with the system date
	 */
	public News(int newsId, String title, String author, String description, LocalDateTime publishedAt,
			String content) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.publishedAt = publishedAt;
		this.content = content;
	}

	
	public int getNewsId() {
		return newsId;
	}


	public void setNewsId(int newsId) {
		this.newsId = newsId;
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDateTime getPublishedAt() {
		return publishedAt;
	}


	public void setPublishedAt(LocalDateTime publishedAt) {
		this.publishedAt = publishedAt;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public News() {

	}

	@Override
	public String toString() {
		return "News{" + "newsId=" + newsId + ", title='" + title + '\'' + ", author='" + author + '\''
				+ ", description='" + description + '\'' + ", publishedAt=" + publishedAt + ", content='" + content
				+ '\'' + '}';
	}
}
