package ycraah.web.javadb.myspringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
  @GetMapping("/home")
  @ResponseBody
  public String home() {
    return "안녕";
  }
}
