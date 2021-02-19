package cc.chengheng.springweb.app;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@EnableWebMvc  // 启用配置WEBMVC
@Configuration
@ComponentScan("cc.chengheng.springweb") /* 和xml里面一个一个bean是一样的，这个是把所有的类都自动扫描创建实例放到spring容器里 */
public class AppConfig implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        System.out.println("ceeeeeeee");
        converters.add(new FastJsonHttpMessageConverter());
    }
}
