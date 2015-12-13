package com.walker.space.service;

import com.walker.space.domain.Blog;

import java.util.List;

/**
 * Created by wk on 2015/12/3.
 */
public interface BlogService {
    List<Blog> getRecentBlogs();
    List<Blog> getRecentBlogs(int size);
}
