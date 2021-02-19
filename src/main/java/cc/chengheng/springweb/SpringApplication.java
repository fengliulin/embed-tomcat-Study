package cc.chengheng.springweb;


import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run();
    }

    /**
     * 理解与模拟springboot嵌入tomcat原理
     */
    public static void run() {
        Tomcat tomcat = new Tomcat();

        try {
            tomcat.setPort(8081);

            // addContext 不会执行 public class MyWebApplicationInitializer implements WebApplicationInitializer {
            //tomcat.addContext("/", "/Users/fengliulin/Documents/");
            tomcat.addWebapp("/", "/Users/fengliulin/Documents/");
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }

}
