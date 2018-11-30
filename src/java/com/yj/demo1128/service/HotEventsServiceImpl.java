package com.yj.demo1128.service;

import com.yj.demo1128.dao.HotEventsMapper;
import com.yj.demo1128.util.PageBean;
import com.yj.demo1128.vo.Hotevents;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service("hotEventsService")
@Transactional
public class HotEventsServiceImpl implements HotEventsService {
    @Resource(name="hotEventsMapper")
    private HotEventsMapper hotEventsMapper;
    @Override
    public List<Hotevents> findAllByPageBean(PageBean pageBean,String keyWord) {
        return hotEventsMapper.findAllByPageBean(pageBean,keyWord);
    }

    @Override
    public Integer count(String keywords) {


        return hotEventsMapper.count(keywords);
    }
}
