package cn.yuren;

import cn.yuren.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 19-7-5.
 */
public class TestDaoAndService {
    @Test
    public void testFindById() throws Exception {
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取接口的代理对象
//        ItemsDao dao = ac.getBean(ItemsDao.class);
//        Items items = dao.findById(3);
//        System.out.println(items);

//        ItemsService service = ac.getBean("itemsService", ItemsService.class);

        ItemsService service = ac.getBean(ItemsService.class);
        System.out.println("service:"+service.findById(1));
    }
}
