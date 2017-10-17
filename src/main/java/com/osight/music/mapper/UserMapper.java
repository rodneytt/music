package com.osight.music.mapper;

import com.osight.music.pojo.UserData;

/**
 * @author chenw <a href="mailto:chenw@chsi.com.cn">chen wei</a>
 * @version $Id$
 */
public interface UserMapper {
    int login(UserData user);
}
