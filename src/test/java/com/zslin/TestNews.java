package com.zslin;

import com.zslin.app.model.News;
import com.zslin.app.service.INewsService;
import com.zslin.basic.repository.SimpleSpecification;
import com.zslin.basic.repository.SimpleSpecificationBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by 钟述林 393156105@qq.com on 2017/1/6 15:35.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("zsl")
public class TestNews {

    @Autowired
    private INewsService newsService;

    @Test
    public void testAdd() {
        News n = new News();

        n.setContent("sdfsdf");
        n.setTitle("test");
        newsService.save(n);
    }

    @Test
    public void testAddBatch() {
        for(int i=0; i<20; i++) {
            News n = new News();
            n.setContent("content"+i);
            n.setTitle("title"+i);
            newsService.save(n);
        }
    }

    @Test
    public void testList() {
        List<Object[]> list = newsService.listBySql("select * from ztw_news");
        System.out.println(list.size()+"==========");
        Assert.assertEquals(10, list.size());
    }

    @Test
    public void testLoad() {
        List<News> list = newsService.findAll(new SimpleSpecificationBuilder().
                add("title", SimpleSpecification.NOT_LIKE, "1").
                add("title", SimpleSpecification.NOT_LIKE_END, "2").generate());
        System.out.println(list.size());
    }
}
