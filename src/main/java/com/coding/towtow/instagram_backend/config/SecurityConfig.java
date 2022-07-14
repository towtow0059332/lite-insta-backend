package com.coding.towtow.instagram_backend.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class SecurityConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
//        WebMvcConfigurer.super.addCorsMappings(registry);
        corsRegistry
                .addMapping("/**")
                .allowedOriginPatterns("*")
//                .allowedOriginPatterns("http://localhost:4200/")
                .allowedMethods("*")
                .allowedHeaders("*");
//                .exposedHeaders("Authorization")
//                .maxAge(3600L);
//                .allowCredentials(true);
    }
}
