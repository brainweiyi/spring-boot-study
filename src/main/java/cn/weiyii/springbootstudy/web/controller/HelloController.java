package cn.weiyii.springbootstudy.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: weiyi
 * @date: 2020/1/20
 * @description: HelloController
 */
@RestController
public class HelloController {

  @GetMapping({"/", "/index"})
  public String hello() {
    return "hello";
  }
}
