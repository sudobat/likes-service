package com.caixabanktech.arq.likes.service.controllers;

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

    @PostMapping
    public HttpEntity createLike(@RequestBody Like like) {
        tweetLikesService.tweetAddLike(like);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PostMapping
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
    public HttpEntity<Integer> countLikes(@PathVariable String tweetId) {

        //tweetLikesService.count(tweetId);
        return new ResponseEntity<>(0,HttpStatus.OK);

    }

}
