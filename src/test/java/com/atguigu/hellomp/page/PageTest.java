package com.atguigu.hellomp.page;

import com.atguigu.hellomp.entity.User;
import com.atguigu.hellomp.mapper.UserMapper;
import com.atguigu.hellomp.service.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 分页插件使用例子
 * @author Sam
 * @create 2024-09-13 9:08 PM
 */
@SpringBootTest
public class PageTest {

  @Autowired
  private UserService userService;

  @Autowired
  private UserMapper userMapper;

  //通用Service分页查询
  @Test
  public void testPageService() {
    IPage<User> page = new Page<>(2, 3);
    IPage<User> result = userService.page(page);
    result.getRecords().forEach(System.out::println);
  }


  //通用Mapper分页查询
  @Test
  public void testPageMapper() {
    IPage<User> page = new Page<>(2, 3);
    IPage<User> result = userMapper.selectPage(page, null);
    result.getRecords().forEach(System.out::println);
  }

  //自定义SQL分页查询
  @Test
  public void testCustomMapper() {
    IPage<User> page = new Page<>(2, 3);
    IPage<User> result = userMapper.selectUserPage(page);
    result.getRecords().forEach(System.out::println);
  }
}
