package com.zslin.app.service;

import com.zslin.app.model.News;
import com.zslin.basic.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by 钟述林 393156105@qq.com on 2017/1/6 15:35.
 */
public interface INewsService extends BaseRepository<News, Integer>, JpaSpecificationExecutor<News> {
}
