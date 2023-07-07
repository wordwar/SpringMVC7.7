package cn.edu.guet.mvc;

/**
 * @Author liwei
 * @Date 2020/9/5 10:57
 * @Version 1.0
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.net.URISyntaxException;
import java.util.Map;

@WebListener()
public class ContextConfigListener implements ServletContextListener {
    /**
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            // 加载工厂类，注入Bean
            Class.forName("cn.edu.guet.ioc.BeanFactory");
            Map<String, ControllerMapping> controllerMapping = new Configuration().config();
            // 服务端给网页（jsp）传数据，把数据放入某个作用域：request、session、application
            sce.getServletContext().setAttribute("cn.guet.web.controller", controllerMapping);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
