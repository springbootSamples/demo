package com.springboot.sample.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleController
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    // @ResponseBody
    String home() {
        return "Spring boot First Demo";
    }
}