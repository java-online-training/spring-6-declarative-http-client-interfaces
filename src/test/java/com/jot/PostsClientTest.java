package com.jot;

import com.jot.domain.Post;
import com.jot.httpclients.PostsClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class PostsClientTest {

	@Autowired
	private PostsClient postsClient;

	@Test
	public void testPostsClientGet() {
		List<Post> posts = postsClient.getAllPosts();
		assertNotNull(posts);
	}

}
