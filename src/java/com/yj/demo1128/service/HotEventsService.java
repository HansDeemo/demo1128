package com.yj.demo1128.service;

import com.yj.demo1128.util.PageBean;
import com.yj.demo1128.vo.Hotevents;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotEventsService {
    public List<Hotevents> findAllByPageBean(PageBean pageBean,String keyWord);
    public Integer count(String keywords);
}
