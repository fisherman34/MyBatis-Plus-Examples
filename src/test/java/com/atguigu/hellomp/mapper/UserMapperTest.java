package com.atguigu.hellomp.mapper;

import com.atguigu.hellomp.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/** 通用Mapper类
 * @author Sam
 * @create 2024-09-10 10:27 PM
 */

@SpringBootTest
class UserMapperTest {

  @Autowired
  private UserMapper userMapper;

  @Test
  public void testList(){
    List<User> users = userMapper.selectList(null);
    users.forEach(System.out::println);
  }

  @Test
  public void testSelectById() {
    User user = userMapper.selectById(1);
    System.out.println(user);
  }

  @Test
  public void testInsert() {
    User user = new User();
    user.setName("zhangsan");
    user.setAge(11);
    user.setEmail("test@test.com");
    userMapper.insert(user);
  }

  @Test
  public void testUpdate() {
    User user = userMapper.selectById(1);
    user.setName("xiaoming");
    userMapper.updateById(user);
  }

  @Test
  public void testDeleteById() {
    userMapper.deleteById(1);
  }
}