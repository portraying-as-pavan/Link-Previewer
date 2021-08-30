package com.example.linkpreviewer.Service;

import com.example.linkpreviewer.Entity.Userd;

public interface UserService {
    void addUser(Userd userd);
    Userd getUserd(String userName);
}
