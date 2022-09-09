package com.portfolio.app;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@AutoConfigureAfter(DispatcherServletAutoConfiguration.class)
public class AppResourcesConfiguration implements WebMvcConfigurer {
   
   @Override
   public void addResourceHandlers(final ResourceHandlerRegistry registry) {
      registry.addResourceHandler("/static/**")
         .addResourceLocations("file:./src/main/resources/static/");
   }

   @Override
   public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("/**").allowedMethods("*");
   }

}
