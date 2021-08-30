package com.example.linkpreviewer.Service;

import com.example.linkpreviewer.Entity.Userd;
import com.example.linkpreviewer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(Userd userd) {
        userRepository.save(userd);
    }

    @Override
    public Userd getUserd(String userName) {
        return userRepository.findById(userName).get();
    }
}
