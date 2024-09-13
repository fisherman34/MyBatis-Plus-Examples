package com.atguigu.hellomp.mapper;

import com.atguigu.hellomp.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* @author sam
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-09-13 21:39:37
* @Entity com.atguigu.hellomp.entity.User
*/

@Mapper
public interface UserMapper extends BaseMapper<User> {

  IPage<User> selectUserPage(IPage<User> page);
}




