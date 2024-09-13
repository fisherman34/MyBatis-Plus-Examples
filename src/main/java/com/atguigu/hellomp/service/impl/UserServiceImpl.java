package com.atguigu.hellomp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.hellomp.entity.User;
import com.atguigu.hellomp.service.UserService;
import com.atguigu.hellomp.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author sam
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-09-13 21:39:37
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




