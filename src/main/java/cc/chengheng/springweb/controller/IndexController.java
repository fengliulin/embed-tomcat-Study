package cc.chengheng.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @GetMapping("/fengliulin")
    public String index() {
        System.out.println("controller");
        return "index";
    }

    @ResponseBody
    @GetMapping("/fengliulin_json")
    public Map<String, String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("张三","里斯");
        return map;
    }
}
