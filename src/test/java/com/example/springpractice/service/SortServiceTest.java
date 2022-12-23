package com.example.springpractice.service;

import com.example.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    void doSort() {

        List<String> actual = sut.doSort(List.of("3","1","5"));

        assertEquals(List.of("1","3","5"), actual);
    }
}