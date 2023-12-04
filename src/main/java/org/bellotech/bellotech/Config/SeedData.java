package org.bellotech.bellotech.Config;

import java.util.List;

import org.bellotech.bellotech.Model.Account;
import org.bellotech.bellotech.Model.Post;
import org.bellotech.bellotech.services.AccountService;
import org.bellotech.bellotech.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {
    @Autowired
    private PostService postService;
    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {

        Account account1 = new Account();
        Account account2 = new Account();

        account1.setEmail("Abello264@gmail.com");
        account1.setFirstName("Mustapha");
        account1.setPassword("Musteroy@1");
        account1.setRoles("USER");

        account2.setEmail("Abubakaro264@gmail.com");
        account2.setFirstName("suliat");
        account2.setPassword("Amoke@1");
        account2.setRoles("ADMIN");

        accountService.save(account1);
        accountService.save(account2);

        List<Post> posts = postService.getAll();
        if (posts.size() == 0) {
            Post post01 = new Post();
            post01.setTitle("Post 01");
            post01.setBody("Post 01 body..........");
            postService.save(post01);

            Post post02 = new Post();
            post02.setTitle("post 01");
            post02.setBody("Post 01 body..........");
            postService.save(post02);
        }

    }

}
