package com.wish.shopping.service;

import com.wish.shopping.dto.Join;
import com.wish.shopping.entity.UserEntity;
import com.wish.shopping.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void joinProcess(Join join){
        // 유저 벨리데이션


        UserEntity entity = new UserEntity();
        entity.setUsername(join.getUsername());
        entity.setPassword(bCryptPasswordEncoder.encode(join.getPassword()));
        entity.setRole("ROLE_USER");
        userRepository.save(entity);
    }
}
