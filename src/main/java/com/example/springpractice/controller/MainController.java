package com.example.springpractice.controller;

import com.example.springpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final SortService sortService;
    public MainController(SortService sortService) {
        this.sortService = sortService;
    }
//    한번만 초기화할꺼라서 final를 붙여줬고 한번만 초기화할수있는 이유는 생성자 주입을 할것이기 때문이다.


    @GetMapping("/")
    public String hello(@RequestParam List<String>list){
        return sortService.doSort(list).toString();
    }
    //@RequestParam을 붙인 해당 입력 인자항목은 필수이다. 입력인자를 넣어줘야 sort할수있기때문에
    //그래서 URL에 ?list-=3,2,1 덧붙인다.
}
