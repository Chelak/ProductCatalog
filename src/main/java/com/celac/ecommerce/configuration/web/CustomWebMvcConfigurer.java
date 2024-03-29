package com.celac.ecommerce.configuration.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

/**
 * @author scelac
 */
@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry
        .addResourceHandler("/js/**", "/css/**", "/images/**","/img/**")
        .addResourceLocations(
            "classpath:/static/img/", "classpath:/static/css/", "classpath:/static/js/",
                "file:/home/scelac/UTM/fileStorageFolder/img/")
        .setCachePeriod(3600)
        .resourceChain(true)
        .addResolver(new PathResourceResolver());
  }
}
