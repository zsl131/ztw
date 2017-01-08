package com.zslin;

import com.zslin.basic.model.User;
import com.zslin.basic.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 钟述林 393156105@qq.com on 2016/12/27 17:21.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("zsl")
public class MyTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testList() {
        User user = userService.findByUsername("admin");
        System.out.println(user.getNickname());
    }
}
