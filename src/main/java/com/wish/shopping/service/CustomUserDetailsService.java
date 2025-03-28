package com.wish.shopping.service;

import com.wish.shopping.dto.CustomUserDetails;
import com.wish.shopping.entity.UserEntity;
import com.wish.shopping.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userRepository.findByUsername(username);
        if(userEntity != null){
            return new CustomUserDetails(userEntity);
        }

        return null;
    }
}
