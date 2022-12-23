package com.example.springpractice.service;

import com.example.springpractice.logic.JavaSort;
import com.example.springpractice.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort; //필드에다가 주입하고싶은 애를 넣는다.

    public SortService(JavaSort<String> sort){// 의존성 주입방식 = 생성자 주입
        this.sort = sort;
    }

    public List<String> doSort(List<String> list){
        Sort<String> sort = new JavaSort<>();

        return sort.sort(list);
    }
    // 이 코드는 정렬 인터페이스를 가지고있긴 하지만 구체적으로 어떤 구현체를 가지고 정렬할것인지  모름
}
