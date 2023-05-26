package com.caixabanktech.arq.likes.service.controllers;

import com.caixabanktech.arq.likes.service.entities.CountLikes;
import com.caixabanktech.arq.likes.service.entities.Like;
import com.caixabanktech.arq.likes.service.services.TweetLikesService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LikesController {

    private TweetLikesService tweetLikesService;

    public LikesController(TweetLikesService tweetLikesService) {
        this.tweetLikesService = tweetLikesService;
    }

    @PostMapping("/likes")
    public HttpEntity createLike(@RequestBody Like like) {
        tweetLikesService.tweetAddLike(like);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PostMapping("/likes/dislike")
    public HttpEntity dislike(@RequestBody Like like) {
        tweetLikesService.tweetRemoveLike(like);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @DeleteMapping("/tweets/{tweetId}/likes")
    public HttpEntity deleteAllLikes(@PathVariable String tweetId) {
        tweetLikesService.tweetDeleteLikes(tweetId);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping("/tweets/{tweetId}/likes/count")
    public HttpEntity<CountLikes> countLikes(@PathVariable String tweetId) {
        int countLikes = tweetLikesService.tweetGetNumLikes(tweetId);
        return new ResponseEntity<>(new CountLikes(Long.valueOf(countLikes)), HttpStatus.OK);
    }

}
