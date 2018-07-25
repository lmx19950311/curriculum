package com.curriculum.web.controller;

import com.curriculum.web.controller.bean.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.concurrent.atomic.AtomicLong;

/**
 * User module interface
 * @author liumengwei
 * @since V1.0
 * @date 2018/7/25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * user login
     * @param device equipment
     * @param name username
     * @return Greeting
     * @author liumengwei
     * @since V1.0
     * @date 2018/7/25
     */
    @RequestMapping("/{device}/userLogin")
    public Greeting greeting(
            @PathParam("device") String device,
            @RequestParam(value="name", defaultValue="World") String name
    ) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}