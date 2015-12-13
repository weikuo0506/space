import com.alibaba.fastjson.JSON;
import com.walker.space.domain.User;
import com.walker.space.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by wk on 2015/12/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class MyBatisTest {
    private static final Logger logger = LoggerFactory.getLogger(MyBatisTest.class);
    @Resource
    private UserService userService;

    @Test
    public void test(){
        User user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }
}
