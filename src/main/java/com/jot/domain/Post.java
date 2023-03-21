package com.jot.domain;

import lombok.Data;

import java.util.Objects;

@Data
public class Post {

    private Integer userId;

    private Integer id;

    private String title;

    private String body;

}
