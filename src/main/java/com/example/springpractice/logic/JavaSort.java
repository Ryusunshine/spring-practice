package com.example.springpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component //이 어노테이션으로 이 클래스는 빈으로 등록된다.
public class JavaSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);
        return output;
    }
}
