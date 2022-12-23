package com.example.springpractice.service;

import com.example.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());
    /*
    만약  javaSort에서 bubbleSort로 바꾸고 싶으면 기존에는 SortService클래스에서 들어간 javaSort를 변경했어어야했다. 하지만
    인터페이스를 만든후에는 SortService는 그대로 있고 SortServiceTest의 생성하는 클래스만 바꿔주면 된다.
     */

    @Test
    void doSort() {

        List<String> actual = sut.doSort(List.of("3","1","5"));

        assertEquals(List.of("1","3","5"), actual);
    }
}