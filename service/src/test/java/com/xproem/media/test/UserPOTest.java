package com.xproem.media.test;

import com.xproem.media.dao.UserPOMapper;
import com.xproem.media.po.UserPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserPOTest {
    @Autowired
    private UserPOMapper userPOMapper;

    public void insertTest() {
        UserPO userPO = new UserPO();
        userPO.setUserName("Abram");
        userPO.setPassword("123456");
        userPO.setCreateTime(new Date());
        userPO.setCreateId(1);
        System.out.println(userPOMapper.insert(userPO));
    }

    @Test
    public void findAll() {
        List<UserPO> list = userPOMapper.findAll();
        for (UserPO userPO : list) {
            System.out.println(userPO.getUserName());
        }
    }
}
