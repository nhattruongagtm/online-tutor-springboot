package com.example.tutoronline.controllers;

import com.example.tutoronline.entities.PostEntity;
import com.example.tutoronline.entities.ResponseObject;
import com.example.tutoronline.entities.ResponsePagination;
import com.example.tutoronline.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.*;

@RequestMapping("/api")
@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @PostMapping("/post")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ResponseObject> createPost(@RequestBody PostEntity post){
        PostEntity postEntity = postRepository.save(post);

        if(postEntity.getId() != null){
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("OK","create post successfully!",postEntity));
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("FAILED","can not create this post!",null));
        }
    }

    @PutMapping("/post/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ResponseObject> editPost(@PathVariable(value = "id") Long id, @RequestBody PostEntity post){
        Optional<PostEntity> postEntity = postRepository.findById(id);

        if(postEntity.isPresent()){

            PostEntity postNow = postEntity.get();

            postNow.setType(post.getType());
            postNow.setPhone(post.getPhone());
            postNow.setTitle(post.getTitle());
            postNow.setContent(post.getContent());
            postNow.setFormality(post.getFormality());
            postNow.setAddressID(post.getAddressID());
            postNow.setIdAccount(post.getIdAccount());
            postNow.setTimeID(post.getTimeID());
            postNow.setLearningDate(post.getLearningDate());
            postNow.setNumberOfMembership(post.getNumberOfMembership());
            postNow.setSubjectID(post.getSubjectID());
            postNow.setTuition(post.getTuition());
            postNow.setFullName(post.getFullName());
            postNow.setStatus(post.getStatus());

            PostEntity updatedPost = postRepository.save(postNow);

            if(updatedPost.getId() != null){
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("OK","update post successfully!",updatedPost));
            }
        }
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("FAILED","update post failed!",null));

    }


    @GetMapping("/post/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ResponseObject> getPostByID(@PathVariable(value = "id") Long id){
        Optional<PostEntity> postEntity = postRepository.findById(id);

        if (postEntity.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("OK","get detail post successfully!", postEntity));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("FAILED","can not get detail post!",null));
    }


    @DeleteMapping("/post/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ResponseObject> deletePost(@PathVariable(value = "id") Long id){
        Optional<PostEntity> postEntity = postRepository.findById(id);

        if (postEntity.isPresent()){
            PostEntity post = postEntity.get();
            post.setStatus(0);
            PostEntity rs = postRepository.save(post);
            if(rs.getId()!=null){
                return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("OK","get detail post successfully!", rs));
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseObject("FAILED","can not found this post!",null));
    }

    @GetMapping("/post")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<ResponseObject> getAllPost(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit, @RequestParam String search, @RequestParam(defaultValue = "-1") Long location, @RequestParam(defaultValue = "-1") Long subjectID, @RequestParam(defaultValue = "-1") Integer formal){

        try {
            List<PostEntity> posts;
            Pageable paging = PageRequest.of(page - 1,limit);

            Page<PostEntity> pagePosts;

            if(search.equals("") && location ==-1 && subjectID == -1 && formal == -1){
                pagePosts = postRepository.findAll(paging);
            }
            else if(!search.equals("") && location ==-1 && subjectID == -1 && formal == -1){
                pagePosts = postRepository.findByTitleContaining(search,paging);
            }
            else{
                pagePosts = postRepository.findByTitleContainingAndAddressIDAndSubjectIDAndFormality(search,location,subjectID,formal, paging);
            }

            posts = pagePosts.getContent();

            ResponsePagination<PostEntity> resp = new ResponsePagination<>();
            resp.setTotalItems(pagePosts.getTotalElements());
            resp.setCurrentPage(pagePosts.getNumber()+1);
            resp.setList(posts);
            resp.setTotalPages(pagePosts.getTotalPages());

            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("OK","get posts successful!",resp)
            );

        }
        catch (Exception e) {
            e.printStackTrace();

            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("NOT FOUND", "can not get post list!", null)
            );
        }
    }

}
