package com.caixabanktech.arq.likes.service.entities;



public class Like {
    private String tweetId;
    private String author;

    public String getAuthor() {
        return author;
    }

    public String getTweetId() {
        return tweetId;
    }

    public Like(String tweetId, String author) {
        this.tweetId = tweetId;
        this.author = author;
    }

    public Like() {
    }

    

    
}
