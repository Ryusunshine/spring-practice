package com.example.springpractice;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringPracticeApplicationTests {

    @Test
    void SpringPracticeTest() {
        String[] args = {"3","1","2"};
        SpringPracticeApplication.main(args);

    }

}
