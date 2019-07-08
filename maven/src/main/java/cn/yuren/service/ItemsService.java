package cn.yuren.service;

import cn.yuren.domain.Items;

/**
 * Created by Administrator on 19-7-5.
 * 业务层接口
 */
public interface ItemsService {
    public Items findById(Integer id);
}
