package cn.yuren.service.impl;

import cn.yuren.service.ItemsService;
import cn.yuren.dao.ItemsDao;
import cn.yuren.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 19-7-5.
 * 业务层接口实现类
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Autowired//按照类型自动扫描
    private ItemsDao dao;//注入dao
    public Items findById(Integer id) {
        return dao.findById(id);
    }
}
