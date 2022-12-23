package com.example.springpractice;

import com.example.springpractice.config.Config;
import com.example.springpractice.logic.Sort;
import com.example.springpractice.service.SortService;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
public class SpringPracticeApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class); //어노테이션 기반으로하는 스프링 컨테이너 생성
        Sort<String> sort = context.getBean(Sort.class); // context로부터 bean을 꺼내온다
        SortService sortService = context.getBean(SortService.class);
        System.out.println("[result]" + sort.sort(Arrays.asList(args)));

    }
}
