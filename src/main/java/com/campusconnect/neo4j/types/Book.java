package com.campusconnect.neo4j.types;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * Created by sn1 on 2/16/15.
 */
@NodeEntity
public class Book {
    @GraphId
    private Long nodeId;

    @Indexed(unique = true)
    private String id;

    @Indexed
    private Integer goodreadsId;

    private String authorName;
    private String goodreadsAuthorId;

    private String name;
    private String isbn;
    private String isbn13;
    private int publishedYear;
    private String description;
    private String publisher;
    private Integer numberOfPages;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    private String imageUrl;

    public Book() {
    }

    public Book(String name, String isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    public Book(String id, String name, String isbn) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getGoodreadsId() {
        return goodreadsId;
    }

    public void setGoodreadsId(Integer goodreadsId) {
        this.goodreadsId = goodreadsId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGoodreadsAuthorId() {
        return goodreadsAuthorId;
    }

    public void setGoodreadsAuthorId(String goodreadsAuthorId) {
        this.goodreadsAuthorId = goodreadsAuthorId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }
}
