package com.douglaspacheco.authservice.auth_api.service;

import com.douglaspacheco.authservice.auth_api.model.Role;
import com.douglaspacheco.authservice.auth_api.model.User;
import com.douglaspacheco.authservice.auth_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User register(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        return userRepository.save(user);
    }
}
