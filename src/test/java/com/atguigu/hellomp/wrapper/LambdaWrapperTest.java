package com.atguigu.hellomp.wrapper;

import com.atguigu.hellomp.entity.User;
import com.atguigu.hellomp.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * LambdaWrapperTest测试类例子
 *
 * @author Sam
 * @create 2024-09-13 6:26 PM
 */

@SpringBootTest
public class LambdaWrapperTest {

  @Autowired
  private UserService userService;

  /**
   * LambdaQueryWrapper
   */
  @Test
  public void testLambdaQueryWrapper() {
    //查询name=Tom的所有用户
    LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    lambdaQueryWrapper.eq(User::getName, "Tom");
    List<User> list = userService.list(lambdaQueryWrapper);
    list.forEach(System.out::println);
  }

  /**
   * LambdaUpdateWrapper
   */
  @Test
  public void testLambdaUpdateWrapper() {
    //将name=Tom的用户的邮箱改为Tom@tom.com
    LambdaUpdateWrapper<User> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();
    lambdaUpdateWrapper.eq(User::getName, "Tom").set(User::getEmail, "Tom@tom.com");
    userService.update(lambdaUpdateWrapper);
  }
}
