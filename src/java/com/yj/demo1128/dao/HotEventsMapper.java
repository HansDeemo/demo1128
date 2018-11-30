package com.yj.demo1128.dao;

import com.yj.demo1128.util.PageBean;
import com.yj.demo1128.vo.Hotevents;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotEventsMapper {
    public List<Hotevents> findAllByPageBean(@Param("pageBean") PageBean pageBean,@Param("keyWord") String keyWord);
    public Integer count(@Param("keyWord") String keyWord);
}
