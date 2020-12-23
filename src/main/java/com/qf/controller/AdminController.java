package com.qf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangl
 * @since 2020-12-23
 */

@RequestMapping("admin")
@Controller
public class AdminController {

    @ResponseBody
    @RequestMapping("test")
    public String test() {
        System.out.println("test");
        return "success";
    }
}
