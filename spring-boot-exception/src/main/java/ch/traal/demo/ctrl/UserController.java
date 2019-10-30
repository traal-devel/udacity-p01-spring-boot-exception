package ch.traal.demo.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

  @RequestMapping("/add")
  public String add() {
    int num = 10 / 0;
    return "add";
  }

  @RequestMapping("/update")
  public String update() {
    String name = null;
    name = name.toLowerCase(); // this line will cause NullPointerException because it calls a method on a null
                               // object
    return "update";
  }
}