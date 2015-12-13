package com.walker.space.service.impl;

import com.walker.space.dao.BlogMapper;
import com.walker.space.domain.Blog;
import com.walker.space.domain.BlogExample;
import com.walker.space.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wk on 2015/12/3.
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> getRecentBlogs() {
        BlogExample example = new BlogExample();
        BlogExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("order by update_datetime desc");
        return blogMapper.selectByExample(example);    }

    @Override
    public List<Blog> getRecentBlogs(int size) {
        BlogExample example = new BlogExample();
        BlogExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("order by update_datetime desc");
        return blogMapper.selectByExample(example);
    }
}
