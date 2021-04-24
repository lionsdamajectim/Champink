package ink.champ.configs;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/index").setViewName("index");
//        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
    }
}
