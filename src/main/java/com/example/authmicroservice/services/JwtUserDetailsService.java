package com.example.authmicroservice.services;

import com.example.authmicroservice.entities.UserEntity;
import com.example.authmicroservice.entities.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public JwtUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //if ("javainuse".equals(username)) {
        //UserEntity userEntity = userRepository.findById(10001);
            //return new User(userEntity.getUserName(), userEntity.getPassword(),
            //        new ArrayList<>());

        return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
                new ArrayList<>());
        //} else {
       //     throw new UsernameNotFoundException("User not found with username: " + username);
        //}
    }
}
