package com.jot;

import com.jot.domain.Post;
import com.jot.httpclients.PostsClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostsClientTest {

	@Autowired
	private PostsClient postsClient;

	@Test
	public void testGetAll() {
		List<Post> posts = postsClient.getAllPosts();
		assertTrue(posts.size()==100);
	}

	@Test
	public void testGetSinglePost() {
		Post postNo5 = postsClient.getPost(5);
		assertTrue(postNo5.id()==5);
	}

	@Test
	public void testDeleteSinglePost() {
		postsClient.deletePost(5);
	}

	@Test
	public void testCreatePost() {
		Post newPost = new Post(1,null,"new title", "new body");
		Post post = postsClient.createPost(newPost);
		assertEquals("new title", post.title());
	}
}