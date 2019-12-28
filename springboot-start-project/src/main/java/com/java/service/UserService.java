package com.java.service;

import com.java.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> selectAll();
}
