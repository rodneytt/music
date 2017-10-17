package com.osight.music.service;

import com.osight.music.pojo.UserData;

/**
 * @author chenw <a href="mailto:chenw@chsi.com.cn">chen wei</a>
 * @version $Id$
 */
public interface UserService {
    boolean login(UserData user);
}
