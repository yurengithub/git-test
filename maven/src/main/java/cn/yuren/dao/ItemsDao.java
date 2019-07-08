package cn.yuren.dao;

import cn.yuren.domain.Items;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 19-7-5.
 * 持久层接口
 */
@Repository("itemsDao")
public interface ItemsDao {
    public Items findById(Integer id);
}
