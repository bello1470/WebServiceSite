package org.bellotech.bellotech.Config;


import java.util.Optional;

import org.bellotech.bellotech.Model.Account;
import org.bellotech.bellotech.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
public class OurUserInfoUserDetailsServices implements UserDetailsService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> user = accountRepository.findByEmail(username);


        return user.map(OurUserInfoDetails::new).orElseThrow(()-> new UsernameNotFoundException("User Not Exist"));
    }

    
}
