package org.bellotech.bellotech.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.bellotech.bellotech.Model.Post;
import org.bellotech.bellotech.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
        @Autowired
    private PostRepository postRepository;

        public Optional<Post> getById(Long Id){
            return postRepository.findById(Id);
        
        }

           public List<Post> getAll(){
            return postRepository.findAll();

        
        }
           public void delete (Post post){
             postRepository.delete(post);
        
        }
        public Post save(Post post){
        if (post.getId() == 0) {
            post.setCreatedAt(LocalDateTime.now());
        }
            return postRepository.save(post);
        }

    
}
