package cn.yuren.controller;

import cn.yuren.domain.Items;
import cn.yuren.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 19-7-5.
 * 表现层
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService service;

    @RequestMapping("/findById")
    public String findById(String id,Model model){
        System.out.println("表现层");
        Items items = service.findById(Integer.parseInt(id));
        model.addAttribute("item",items);//存到request域中

        return "itemDetail";
    }
}
