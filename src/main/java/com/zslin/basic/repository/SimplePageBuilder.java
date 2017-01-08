package com.zslin.basic.repository;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * Created by 钟述林 393156105@qq.com on 2017/1/8 15:19.
 */
public class SimplePageBuilder {

    public static final int size = 15;

    public static Pageable generate(int page, int size, Sort sort) {
        if(sort==null) return new PageRequest(page, size);
        return new PageRequest(page, size, sort);
    }

    public static Pageable generate(int page) {
        return generate(page,size,null);
    }

    public static Pageable generate(int page,Sort sort) {
        return generate(page,size,sort);
    }
}
