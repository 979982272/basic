package com.htree.datacenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weihua
 * @description
 * @date 2020/1/10 0010
 **/
@Controller
public class IndexController {
    @RequestMapping
    public String index() {
        return "index";
    }
}
