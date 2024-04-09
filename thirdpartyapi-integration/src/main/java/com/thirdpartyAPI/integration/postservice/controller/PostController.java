package com.thirdpartyAPI.integration.postservice.controller;

import com.thirdpartyAPI.integration.postservice.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test-api")
public class PostController {

    @Autowired
    PostServiceImpl postService;
    @GetMapping("/posts")
   public  List<Map<String, Object>> getAllPosts(){
            return postService.getPosts();
        }

        @GetMapping("/posts/{id}")
        public Map<String, Object> getPostById(@PathVariable Integer id){
        return postService.getPostByID(id);
        }

        @PostMapping("/posts")
        public Map<String, Object> insertPost(@RequestBody Map<String, Object> reqBody){
            return postService.inserPost(reqBody);
        }

        @PutMapping("/posts/{id}")
    public Map<String, Object> updatePost(@RequestBody Map<String, Object> reqBody,@PathVariable Integer id){
        return postService.updatePost(reqBody,id);
        }

    @DeleteMapping("/posts/{id}")
    public Map<String, Object> deletePostByID(@PathVariable Integer id){
        return postService.deletePostByID(id);
    }


}
