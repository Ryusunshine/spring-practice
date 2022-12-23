package com.example.springpractice.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.example.springpractice") //이 path 이하의 스프링bean들을 모두 스캔하겠다 라고 설정
@Configuration// Bean 설정 파일임을 알려주는 @Configuration
public class Config {
}
