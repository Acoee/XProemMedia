package com.xproem.media.service;

import com.xproem.media.dao.UserPOMapper;
import com.xproem.media.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserPOMapper userPOMapper;

    public List<UserPO> findAll() {
        return  userPOMapper.findAll();
    }
}
