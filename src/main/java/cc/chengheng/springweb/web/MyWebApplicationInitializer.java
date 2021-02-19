package cc.chengheng.springweb.web;

import cc.chengheng.springweb.app.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        System.out.println("=========init=========");

        // 加载Spring Web应用程序配置
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(AppConfig.class);
//        context.refresh();


        // 参数相当于原来的配置 [/WEB-INF/mvc-servlet.xml]， 改成注解了
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        // 注册一个servlet
        ServletRegistration.Dynamic registration = servletContext.addServlet("mvc", dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/*");
    }
}
