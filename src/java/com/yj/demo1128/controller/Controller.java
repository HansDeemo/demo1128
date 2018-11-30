package com.yj.demo1128.controller;

import com.yj.demo1128.service.HotEventsService;
import com.yj.demo1128.util.PageBean;
import com.yj.demo1128.vo.Hotevents;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
//控制层相当于servlet
@org.springframework.stereotype.Controller
public class Controller {
    //调用业务类资源
    @Resource(name="hotEventsService")
    private HotEventsService hotEventsService;
    //由list.do跳转到list页面
    @RequestMapping("/list.do")
    public String list(String pageNo, String keyWord, Model model){
        //读取页面页码值
        Integer pageNoInt = 0;
        //非空转INT类型并赋值
        if(pageNo != null){
            pageNoInt=Integer.parseInt(pageNo);
        }else {
            //重新初始化页码值为一
            pageNoInt =1;

        }
        //计算出总数据数
        Integer count = hotEventsService.count(keyWord);
        //获得PageBean对象
        PageBean pageBean = new PageBean(pageNoInt,3,count);
        //获得热点事件集合
        List<Hotevents> list=hotEventsService.findAllByPageBean(pageBean,keyWord);
        //传list到页面
        model.addAttribute("list",list);
        //传pageBean到页面
        model.addAttribute("pageBean",pageBean);
        //传keyWord到页面
        model.addAttribute("keyWord",keyWord);

        return "list";
    }
}
