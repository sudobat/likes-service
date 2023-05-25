package com.caixabanktech.arq.likes.service.services;

import com.caixabanktech.arq.likes.service.entities.Like;

public interface TweetLikesService {

    public void tweetAddLike(Like like);

    public void tweetRemoveLike(Like like);

    public void tweetDeleteLikes(String tweetId);
    
    public int tweetGetNumLikes(String tweetId);

}
