package com.xproem.media.dao;

import com.xproem.media.po.UserPO;

import java.util.List;

public interface UserPOMapper {
    List<UserPO> findAll();
    int insert(UserPO userPO);
}
