package com.caixabanktech.arq.likes.service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Like {
    private String tweetId;
    private String author;
}
