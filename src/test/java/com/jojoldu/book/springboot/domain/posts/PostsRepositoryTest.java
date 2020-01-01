package com.jojoldu.book.springboot.domain.posts;

import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;

public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

}
