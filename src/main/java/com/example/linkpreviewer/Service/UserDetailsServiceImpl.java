package com.example.linkpreviewer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.linkpreviewer.Entity.Userd;
import com.example.linkpreviewer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Userd user = userRepository.findById(username).get();
        System.out.println(user);
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        //  return new User(user.getUsername(),new BCryptPasswordEncoder().encode(user.getPassword()),user.getRole());
        return new MyUserDetailsService(user);
    }
}