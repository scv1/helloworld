package com.how2java.springboot.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

public class PageHelperConfig {
	@Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
