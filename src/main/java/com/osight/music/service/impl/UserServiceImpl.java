package com.osight.music.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osight.music.mapper.UserMapper;
import com.osight.music.pojo.UserData;
import com.osight.music.service.UserService;

/**
 * @author chenw <a href="mailto:chenw@chsi.com.cn">chen wei</a>
 * @version $Id$
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean login(UserData user) {
        int count = userMapper.login(user);
        return count > 0;
    }
}
